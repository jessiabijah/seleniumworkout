package org.Data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartRobot2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btn.click();
		WebElement txtemail = driver.findElement(By.xpath("//input[@name='q']"));
		txtemail.sendKeys("women");
		WebElement btn1 = driver.findElement(By.xpath("//button[@type='submit']"));
		btn1.click();
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		WebElement prod = driver.findElement(By.xpath("//div[@class='_4ddWXP'][1]"));
		a.contextClick(prod).perform();
		Robot r = new Robot();
		for (int i = 0; i <= 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
	}

		
}

