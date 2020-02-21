package com.max_international.utils;


import com.max_international.utils.ConfigFileReader;

/**
 * @author nimit.jain
 *
 */
public class Logger {
	
	public static void log(String msg){
		System.out.printf(msg, ConfigFileReader.getLogToConsole());
	}
	
	public static void log(String msg, int level) {
		System.out.printf(msg, level, ConfigFileReader.getLogToConsole());
	}
}
