package org.Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		//browser----Chrome, key---browser, value---location of driver e
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		//instanciation
		WebDriver driver =new ChromeDriver();
	
		//to lanunch url
		driver.get(" http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		
		//to close a browser
		driver.close();
	}

}
