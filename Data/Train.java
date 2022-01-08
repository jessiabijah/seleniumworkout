package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtfrom=driver.findElement(By.xpath("//input[@title='From station']"));
		txtfrom.sendKeys("Chennai beach (MSB)");
		
		WebElement txtto=driver.findElement(By.xpath("//input[@title='To station']"));
		
		txtto.sendKeys("Tirunelveli (TEN)");
		
		WebElement txtsearch=driver.findElement(By.id("//button[@id='trainFormButton']"));
		txtsearch.click();
}
}
