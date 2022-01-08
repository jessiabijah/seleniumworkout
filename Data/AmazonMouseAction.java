package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseAction {
	public static void main(String[] args) throws InterruptedException {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("http://www.amazon.in");
		Actions a = new Actions(driver);
		WebElement prime =driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		a.moveToElement(prime).perform();
		Thread.sleep(1000);
	    WebElement img =driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	    img.click();
		
				
}
}
