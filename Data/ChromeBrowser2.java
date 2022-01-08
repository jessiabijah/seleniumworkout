package org.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser2 {
	public static void main(String[] args) {
		//browser----Chrome, key---browser, value---location of driver e
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		//instanciation
		WebDriver driver =new ChromeDriver();
	
		//to lanunch url
		driver.get(" http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//to close a browser
		driver.close();
	}

}





