package org.Data;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsflipMouseAction {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Actions a = new Actions(driver);
		WebElement btnlogin =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnlogin.click();
		WebElement mobile =driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobile.click();
		Thread.sleep(1000);
		WebElement elect =driver.findElement(By.xpath("//span[@class='_2I9KP_'][1]"));
		a.moveToElement(elect).perform();
		Thread.sleep(1000);
		WebElement realme =driver.findElement(By.xpath("//a[@class='_3QN6WI'][2]"));
		realme.click();
		Thread.sleep(1000);
		WebElement prod =driver.findElement(By.xpath("//div[text()='realme C21 (Cross Black, 32 GB)']"));
		prod.click();
		
		
}
}
