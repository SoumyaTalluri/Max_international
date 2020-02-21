package com.max_international.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Assert;

/**
 * @author nimit.jain
 *
 */
public class PropFileHandler{
	
	//public static Logger logger = Logger.getLogger("TestActivity");
	static Properties properties = new Properties();

	static String filePath = System.getProperty("user.dir")+File.separator+
            "src"+File.separator+"main"+File.separator+"resources"+File.separator+"dataFile"+File.separator+"QA.properties";
	
	/**
	 * This method is used to read the value of the given property from the properties file.
	 * 
	 * @param property : the property whose value is to be fetched.
	 * @return the value of the given property.
	 */
	public static String readProperty(String property) 
	{
		InputStream inPropFile = null;
		try {
			inPropFile = new FileInputStream(filePath);
			properties.load(inPropFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value=properties.getProperty(property);	
		if(value == null){
			Assert.fail(property+" is not present in properties file.");
		}
		return value;
	}

	/**
	 * This method is used to check whether the given parameter is present in properties file.
	 * 
	 * @param property
	 * @return
	 */
	public static boolean hasProperty(String property) 
	{
		InputStream inPropFile = null;
		try {
			inPropFile = new FileInputStream(filePath);
			properties.load(inPropFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value=properties.getProperty(property);	
		System.out.println("Successfully found property :" + property + " value: " + value);
		if(value == null){
			return false;
		}
		return true;
	}

	/**
	 * This method is used to write the value of the property in property file.
	 * @param property
	 * @param value
	 * @throws IOException
	 */
	public static void writeToFile(String property, String value)  {
		if(value!=null){
			try {
				InputStream inPropFile = new FileInputStream(filePath);
				properties.load(inPropFile);
				inPropFile.close();
				OutputStream outPropFile = new FileOutputStream(filePath);
				properties.setProperty(property, value);
				properties.store(outPropFile, null);
				outPropFile.close();
				System.out.println("Successfully updated for property: " + property + " value: " + value);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Value is null");
		}
			
		
	}
	
	/**This method is used to delete value and property name from property file.
	 * @param property
	 */
//	public static void deleteFromFile(String property){
//		try {
//			InputStream inPropFile = new FileInputStream(filePath);
//			OutputStream outPropFile = new FileOutputStream(filePath);
//			properties.load(inPropFile);
//			properties.remove(property);
//			properties.store(outPropFile, null);
//			logger.info("Successfully deleted for property: " + property);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
