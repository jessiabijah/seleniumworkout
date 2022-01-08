package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.redbus.in/");
		WebElement txtFrom=driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		WebElement txtto=driver.findElement(By.id("dest"));
		txtto.sendKeys("Tirunelveli");
		
		

	}

}
	