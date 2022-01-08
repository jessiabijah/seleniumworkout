package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreeensTech1 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get()
		driver.get("http://greenstech.in/selenium-course-content.html");
       
}
}
