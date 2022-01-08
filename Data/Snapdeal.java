package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement txtEmail=driver.findElement(By.id("userName"));
		txtEmail.sendKeys("jessiabijah@gmail.com");
		
		
		
		
	}

}
