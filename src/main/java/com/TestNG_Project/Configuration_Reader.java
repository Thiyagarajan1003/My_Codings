package com.TestNG_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\Thiyagarajan\\eclipse-workspace\\mavenproject\\configuration.properties");
		FileInputStream finputstream = new FileInputStream(f);
		p = new Properties();
		p.load(finputstream);
	}

	public String getBrowser() {
		// TODO Auto-generated method stub
		String browser = p.getProperty("browser");
		return browser;
	}

	public String geturl() {
		// TODO Auto-generated method stub
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
		
	}

}
