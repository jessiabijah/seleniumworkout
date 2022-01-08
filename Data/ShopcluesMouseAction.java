package org.Data;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesMouseAction {
	public static void main(String[] args) {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a =new Actions(driver);
		WebElement sports =driver.findElement(By.xpath("//a[@href='javascript:void(0);'][28]"));
		sports.click();
		WebElement w =driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.moveToElement(w).perform();
		
				
}
}
