package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NetBanking {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get(" https://netbanking.hdfcbank.com/");

		WebElement txtName=driver.findElement(By.xpath("form-control text-muted"));
		txtName.sendKeys("Jessi Abijah");
		
				
				
				
	}
}
