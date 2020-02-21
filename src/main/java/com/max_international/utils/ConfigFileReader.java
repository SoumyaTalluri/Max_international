package com.max_international.utils;

import static com.max_international.utils.DataReadWrite.getProperty;

/**
 * @author nimit.jain
 *
 */
public class ConfigFileReader {

    static String tier;
    static String timeout;   
    static Boolean logtoconsole;
    static String database;
    static String store;
    
    
    public enum Tiers {
    	cert,CERT,qa,QA,staging, stage,STAGE,STAGING,
    	production,prod,PROD,PRODUCTION,DEV,dev
    }
    
    
    private static void setTier() {
    	tier = getProperty("Config.properties", "tier");
	    switch (Tiers.valueOf(tier)) {
	        case STAGE:
            case stage:
            case staging:
            case STAGING:
                tier = "STAGE";
                break;
            case prod:
            case PROD:
            case production:
            case PRODUCTION:
                tier = "PROD";
                break;
            case qa:
            case QA:
            	tier = "QA";
            	break;
            case cert:
            case CERT:
            	 tier = "CERT";
            	 break;
            case dev:
            case DEV:
            	 tier = "DEV";
            	 break;
          default:
			tier = "STAGE";
			break;
	     }
    }
    
    public static String getTier(){
    	setTier();
    	return tier;
    }

    public static String getTimeOut() {
		timeout = getProperty("timeout");
		return timeout;
	}
    
    public static Boolean getLogToConsole() {
		logtoconsole = Boolean.valueOf(getProperty("Config.properties","logtoconsole"));
		return logtoconsole;
	}
    
    public static String getDatabase(){
    	database = getProperty("database");
    	return database;
    }
    
    public static String getStore(){
    	String store = System.getProperty("store");
		if(store == null){
			store = getProperty("store");
		}
    	return store;
    }
}
