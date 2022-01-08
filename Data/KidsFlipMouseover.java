package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KidsFlipMouseover {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Actions a = new Actions(driver);
		WebElement btnlogin =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnlogin.click();
		WebElement fash=driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(fash).perform();
		
		WebElement all =driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
		all.click();
		WebElement kids=driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(kids).perform();
		WebElement toys=driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		toys.click();
	}
}


