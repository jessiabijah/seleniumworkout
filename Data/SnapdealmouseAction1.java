package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealmouseAction1 {
	public static void main(String[] args) throws InterruptedException   {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		WebElement womenfash=driver.findElement(By.xpath("//span[@class='catText'][7]"));
		a.moveToElement(womenfash).perform();
		WebElement footwear=driver.findElement(By.xpath("//a[@data-index='1.1.10'][7]"));
		footwear.click();
		WebElement heels=driver.findElement(By.xpath("//a[data-index='1.1.11']"));
		heels.click();
	}
	
}