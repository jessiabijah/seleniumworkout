package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelapp1 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get();
		driver.get("http://adactinhotelapp.com/");
		//to find a webelement----find element()returntype--webelement
		WebElement txtEmail=driver.findElement(By.xpath("//input[@name='username']"));
		txtEmail.sendKeys("jessiabijah@gmail.com");
		WebElement txtpassword=driver.findElement(By.xpath("//input[@name='password']"));
		txtpassword.sendKeys("jessi123");
		String s=txtEmail.getAttribute("value");
		System.out.println(s);
		String a=txtpassword.getAttribute("value");
         System.out.println(a);

		
}
}
