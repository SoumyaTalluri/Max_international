package com.max_international.automation.framework;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.yaml.snakeyaml.Yaml;

import com.max_international.utils.PropFileHandler;




/**
 * 
 * @author Nimit Jain
 *
 */
public class ConfigurationRegistory {

	Map<String, Object> registry;
	private static String OS = System.getProperty("os.name").toLowerCase();
	public static String url;

	
	@SuppressWarnings("unchecked")
	public ConfigurationRegistory() {
		registry = (Map<String, Object>) new Yaml()
				.load(getClass().getClassLoader().getResourceAsStream("configurationRegistry.yaml"));
	}

	public WebDriver getDriver(Map<String, Object> config) throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		return getDriver(config, options);
	}

	public WebDriver getDriver(Map<String, Object> config, Map<String, Object> options) throws IOException {
		String projectPath = System.getProperty("user.dir");
		String driverPath = null;
		System.out.println(OS);

		if (isWindows()) {
			System.out.println("This is Windows");
			driverPath = projectPath+""+"/src/main/resources/drivers/window/chromedriver.exe";
		} else if (isMac()) {
			System.out.println("This is Mac");
			driverPath = projectPath+""+"/src/main/resources/drivers/mac/chromedriver";
		} else if (isUnix()) {
			System.out.println("This is Unix or Linux");
			driverPath = projectPath+""+"/src/main/resources/drivers/linux/chromedriver";
		}  else {
			System.out.println("Your OS is not supported!!");
		}

		System.out.println("The driver path is "+driverPath);

		String testConfiguration = System.getProperty("test-config", config.get("test-configuration").toString());

        if (options.containsKey("TEST_CONFIGURATION")) {
            testConfiguration = options.get("TEST_CONFIGURATION").toString();
        }

        TestSession.logger.info("Launching Test Configuration: " + testConfiguration + " ...");
        System.out.println("Launching Test on Configuration: " + testConfiguration + " ...");

		Map<String, String> configRegistory = (Map<String, String>) registry.get(testConfiguration);

		WebDriver driver = null;
		System.out.println(configRegistory);
		url = configRegistory.get("server");
		
		switch (configRegistory.get("browser")) {
		case "chrome":
			if (configRegistory.get("mode").equalsIgnoreCase("remote")) {
				// sauce or selenium grid
			} else {
				ChromeOptions chromeOptions;
				switch (configRegistory.get("os").toLowerCase()) {
				case ("mac"):
					// TODO need to check if chromedriver exists
					System.setProperty("webdriver.chrome.driver", driverPath);
					chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("test-type");
					chromeOptions.addArguments("start-maximized");
					//chromeOptions.addArguments("--incognito");
					chromeOptions.addArguments("--disable-web-security");
					chromeOptions.addArguments("--allow-running-insecure-content");
					driver = new ChromeDriver(chromeOptions);
					break;
				case ("windows"):
					System.out.println("------- In the windows method-------");
					// TODO need to check if chromedriver exists
					System.setProperty("webdriver.chrome.driver", driverPath);
				
					chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("test-type");
					chromeOptions.addArguments("start-maximized");
					chromeOptions.addArguments("--incognito");
					chromeOptions.addArguments("--no-sandbox");
					//chromeOptions.addArguments("--headless");
					chromeOptions.addArguments("--disable-gpu");
					chromeOptions.addArguments("--disable-translate");
					chromeOptions.addArguments("--disable-extensions");
					chromeOptions.addArguments("--disable-web-security");
					chromeOptions.addArguments("--disable-web-security");
					chromeOptions.addArguments("--allow-running-insecure-content");
					driver = new ChromeDriver(chromeOptions);
					break;
				default:
					driver = new ChromeDriver();
				}

			}

			driver.get(configRegistory.get("server"));
			

			break;
		default:
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );

	}
	
	

}
