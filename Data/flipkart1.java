package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get(" https://www.flipkart.com/");
		WebElement txtemail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtemail.sendKeys("jessiabijah@gmai.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtpassword.sendKeys("Jessi123");
		String s=txtemail.getAttribute("value");
		System.out.println(s);
		String a=txtpassword.getAttribute("value");
         System.out.println(a);


	}
}


