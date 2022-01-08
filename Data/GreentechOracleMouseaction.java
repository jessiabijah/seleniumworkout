package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreentechOracleMouseaction {
	public static void main(String[] args)  {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get( "http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions(driver);
		WebElement course =driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(course).perform();
		WebElement oracletraine  =driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracletraine).perform();
		WebElement sqltraine  =driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		sqltraine.click();
		
			
}
}
