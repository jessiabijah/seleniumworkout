package org.Data;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartDouble {
	public static void main(String[] args) throws AWTException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a =new Actions(driver);
		WebElement lgn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		a.click(lgn);
		WebElement txtemail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		a.sendKeys(txtemail, "jessiabijah").perform();
		a.doubleClick(txtemail).perform();
		for (int i = 0; i < 2; i++) {
			
			
			
	
}
}
}
	