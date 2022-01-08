package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		//browser---chrome;key----browserkey;value---location of driver e
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//Instantiation
		WebDriver driver =new ChromeDriver();
		//to lanuch url
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//to find a webelement--findelement--returntype---webelement
		WebElement txtName =driver.findElement(By.id("DUMMY1"));
		//to pass a particular field
	     txtName.sendKeys("Jessi Abijah");
	     WebElement txtpassword =driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		 txtpassword.sendKeys("Jessi3445");
		
	}

}