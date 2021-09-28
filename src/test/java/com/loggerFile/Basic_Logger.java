package com.loggerFile;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Logger {

	// Factory Design Pattern
	
	static Logger log = Logger.getLogger(Basic_Logger.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("Debug");
		log.info("info");
		log.warn("Warnings");
		log.error("Error");
		log.fatal("Fatal Message");
		
	}
	
}
