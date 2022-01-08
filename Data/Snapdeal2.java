package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal2 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get()
		driver.get("https://www.snapdeal.com/");
		 //to find a webelement----find element()returntype--wbelement
		//a[@class='subDefault recentLink'][4]
		WebElement txtname=driver.findElement(By.xpath("//input[@name=\"keyword\"][1]"));
        txtname.sendKeys("watch");
		txtname.click();
       WebElement txtprod=driver.findElement(By.xpath("//img[@class=\"product-image wooble\"][1]"));
       
		

 
			
}
}
