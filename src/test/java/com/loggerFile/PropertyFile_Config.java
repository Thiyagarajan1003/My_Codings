package com.loggerFile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFile_Config {
static Logger log = Logger.getLogger(PropertyFile_Config.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("log4j.properties");
	log.debug("Debug");
	log.info("Info");
	log.warn("Warn");
	log.error("error");
	log.fatal("Fatal");
}
}
