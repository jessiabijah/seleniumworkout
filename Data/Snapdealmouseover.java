package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdealmouseover {
	
		public static void main(String[] args)   {
			// browser--chrome;key---browser key;value--location of drive e
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			// instanciation
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// to launch url---get();
			driver.get("https://www.snapdeal.com/");
			Actions a = new Actions(driver);
			WebElement mobile =driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
			a.moveToElement(mobile).perform();
			WebElement cover =driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
			cover.click();
		}
}
					
