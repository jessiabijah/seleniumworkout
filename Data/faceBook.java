package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class faceBook {
	public static void main(String[] args) {
		// browser----chrome;key---browserkey; value----location of driver e
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		//Instantiation
		WebDriver driver=new ChromeDriver();
		//to launch url---get()
		driver.get("https://en-gb.facebook.com/");
		//to find a webelement---find element()returntype:webelement
		WebElement txtEmail =driver.findElement(By.id("email"));
		//to pass the value for particular field
		txtEmail.sendKeys("jessiabijah@gmail.com");
		//to find a webelement---find element()returntype:webelement
		WebElement txtpassword =driver.findElement(By.name("pass"));
		txtpassword.sendKeys("1234jessi");
}
}