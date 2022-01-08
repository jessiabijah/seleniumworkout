package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement txtname =driver.findElement(By.id("location"));
		txtname.sendKeys("xys");
		
	}

}
