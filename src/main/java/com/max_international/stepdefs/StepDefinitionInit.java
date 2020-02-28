package com.max_international.stepdefs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.Yaml;

import com.max_international.automation.framework.ConfigurationRegistory;
import com.max_international.automation.framework.TestSession;
import com.max_international.login.po.HomePO;
import com.max_international.login.po.LoginPO;
import com.max_international.utils.PropFileHandler;

/**
 * 
 * @author Nimit Jain
 *
 */
public class StepDefinitionInit {

	Map<String, Object> options = new HashMap<String, Object>();
	protected static TestSession session;
	static LoginPO loginPO;
	static HomePO homePo;

	public TestSession getTestSession() throws Exception {

		options.put("APPIUM_APP_NO_RESET", true);
		if (session == null) {
			session = new TestSession(options);
			// session.driver.navigate().refresh();
		}else {

			
	
			String url = ConfigurationRegistory.url;
			session.driver.get(url);

		}

		for (Entry<String, Object> entry : session.config.entrySet()) {
			System.out.println(" ********  " + entry.getKey() + " " + entry.getValue());
		}

		loginPO = new LoginPO(session);
		homePo = new HomePO(session);
		
		return session;
	}

}
