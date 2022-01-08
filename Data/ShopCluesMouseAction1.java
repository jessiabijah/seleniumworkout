package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopCluesMouseAction1 {
	public static void main(String[] args) throws InterruptedException {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a = new Actions(driver);
		WebElement mobile =driver.findElement(By.xpath("//li[@id='nav_44']"));
		a.moveToElement(mobile).perform();
		Thread.sleep(2000);
		WebElement smartph =driver.findElement(By.xpath("//li[@class='g_heading'][1]"));
		(smartph).click();
		WebElement range =driver.findElement(By.xpath("//label[@for='Above 5000']"));
        range.click();
		
		
}
}