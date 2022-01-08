package org.Data;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
	public static void main(String[] args) {

		// browser--edgebrowser, key---browserkey, value-location of driver e
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		// instanciation
		WebDriver driver = new EdgeDriver();
		driver.get(" https://www.flipkart.com/");
		WebElement txtemail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtemail.sendKeys("jessiabijah@gmai.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtpassword.sendKeys("Jessi123");
		
	}

	}


