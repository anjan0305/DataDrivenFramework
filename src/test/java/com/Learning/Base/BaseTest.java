package com.Learning.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties config = new Properties ();
	public static Properties OR = new Properties ();
	public static Logger log = Logger.getLogger("devpinoyLogger") ;
	                                             
	
	public boolean isElementPresent (By by) {
		
		try {
		driver.findElement(by);
		return true;	

		} catch (Exception e){
			return false;
		}
		
		
	
		
	}
	
	
	
	
	@BeforeSuite
	public void setUp() {
		
		if (driver == null) {
			
		
		try {
			
			PropertyConfigurator.configure ("./src/log4j.properties");
			log.debug("Inside the setUp process");
			FileInputStream fs1=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Config.properties");
			FileInputStream fs2=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//OR.properties");
			
			config.load(fs1);
			log.debug("Loaded config file");
			OR.load(fs2);
			log.debug("Loaded OR file");
	       if ((config.getProperty("browser")).equalsIgnoreCase("Chrome")){
	    	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
	           driver= new ChromeDriver(); 
	       } else if ((config.getProperty("browser")).equalsIgnoreCase("Mozilla")) {
	    	   // implement later
	       } else if ((config.getProperty("browser")).equalsIgnoreCase("Edge")) {
	    	   
	    	// implement later
	    	   
	       } else {
	    	// implement later
	       }
	       log.debug("Browser initiated");
	       
	      // DesiredCapabilities caps = new DesiredCapabilities();
	      // caps.setCapability("resolution", "1920*1080");
	       driver.get(config.getProperty("siteurl"));
	      // driver.manage().window().setSize(new Dimension(1200,1600));
	       driver.manage().window().maximize();
	      

	     driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("application_timeout")), TimeUnit.SECONDS);
	   
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterSuite
	public void tearDown() {
		if (driver !=null) {
			driver.quit();
			log.debug("complete the tear down");
		}
	}
	
	

}
