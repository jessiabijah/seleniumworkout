package org.Data;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones X ");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone X, US Version, 64GB, Space Gray - Fully Unlocked (Renewed)']")).click();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
}
}
