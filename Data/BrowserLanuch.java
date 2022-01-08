package org.Data;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLanuch {
public static void main(String[] args) { 
	//browser---gecko, key-----browser, value--location of driver e 
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
	
	//instanciation
	WebDriver driver =new FirefoxDriver();
	
	//to launch url---get
	driver.get(" http://www.greenstechnologys.com/");
	driver.get(" https://www.facebook.com/");
	
	//to close a browser
	driver.close();
}
}

