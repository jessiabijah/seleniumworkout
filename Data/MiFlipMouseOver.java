package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiFlipMouseOver {
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
		WebElement Mi =driver.findElement(By.xpath("//a[@class='_3QN6WI'][1]"));
		Mi.click();
		Thread.sleep(1000);
		WebElement prod =driver.findElement(By.xpath("//div[text()='Redmi 9 (Sporty Orange, 64 GB)']"));
		prod.click();
		
}
}
