package org.Data;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartjavaScript {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement btnlogin=driver.findElement(By.xpath("//class[text()='Login']"));
		js.executeScript("arguments[0].click()",btnlogin);
		
}
}
