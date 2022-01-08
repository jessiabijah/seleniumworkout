package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get();
		driver.get("http://www.google.com/");
		//to find a webelement----find element()returntype--wbelement
		WebElement txtname=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtname.sendKeys("greens velmurugan ");
		txtname.click();
		WebElement txtlink=driver.findElement(By.xpath("//cite[@class='iUh30 qLRx3b tjvcx'][1]"));
		txtlink.click();
		
		
}
}
