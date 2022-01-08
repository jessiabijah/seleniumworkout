package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseAction {
	public static void main(String[] args) throws InterruptedException  {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("http://www.flipkart.com");
		Actions a = new Actions(driver);
		WebElement btnlogin =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnlogin.click();
		WebElement homeapp=driver.findElement(By.xpath("//div[@class='eFQ30H'][6]"));
        a.moveToElement(homeapp).perform();
        Thread.sleep(3000);
        WebElement bathlinen =driver.findElement(By.xpath("//a[text()='Bath linen']"));
        bathlinen.click();
        Thread.sleep(1000);
        WebElement bathlinen1 =driver.findElement(By.xpath("//a[text()='AK Textiles Cotton 400 GSM Hand Towel Set'][1]"));
        String t=bathlinen1.getText();
        System.out.println(t);
}
}