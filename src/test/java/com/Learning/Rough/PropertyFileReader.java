package com.Learning.Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		Properties config = new Properties ();
		Properties OR = new Properties ();
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fs1=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Config.properties");
		FileInputStream fs2=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//OR.properties");
		config.load(fs1);
		OR.load(fs2);
		System.out.println(OR.getProperty("ROBOT_ICON"));
		System.out.println(config.getProperty("browser"));
		
		
		

	}

}
