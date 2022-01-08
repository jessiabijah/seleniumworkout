package org.Data;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensDataWareMouseaction {
	public static void main(String[] args) {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get( "http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions(driver);
		WebElement course =driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(course).perform();
		WebElement datawaretraine  =driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(datawaretraine).perform();
		
			

}
}


