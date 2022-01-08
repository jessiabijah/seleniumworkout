package org.Data;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealwindowhand {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='keyword'][1]")).sendKeys("iphones 7");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		driver.findElement(By.xpath("//p[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black']")).click();
		
}
}
