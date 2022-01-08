package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txticon = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		txticon.click();
		WebElement txtname = driver.findElement(By.xpath("//li[@id='signInLink']"));
		txtname.click();
		WebElement txtphno = driver.findElement(By.xpath("//div[@class='mobileInputContainer clearfix contact-box']"));
		txtphno.sendKeys("8300032276");
		
	}

}



