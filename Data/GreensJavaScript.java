package org.Data;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensJavaScript {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement PgDown=driver.findElement(By.xpath("//div[@class='trainer-info'][5]"));
	    Thread.sleep(4000);
		js.executeScript("arguments[0].SrollIntoView,pgDown");
		
				
}

	
	}

