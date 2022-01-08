package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(" https://www.amazon.in/");
		WebElement txtaddress = driver.findElement(By.xpath("//input[@type='text']"));
		txtaddress.sendKeys("iphone 12+");
		WebElement txtsearch = driver.findElement(By.xpath("//input[@type='submit'][1]"));
	    txtsearch.click();

	}

}
