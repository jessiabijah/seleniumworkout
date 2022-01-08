package org.Data;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement txtName = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		txtName.sendKeys("jessiabijah3@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("8300032276");
		WebElement buttonlogin = driver.findElement(By.xpath("//button[@value='1']"));
		buttonlogin.click();
	}
}