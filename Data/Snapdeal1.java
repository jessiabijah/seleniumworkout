package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Snapdeal1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement textname=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		textname.click();
		WebElement textuser=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		textuser.click();
		WebElement textphno=driver.findElement(By.name("//input[@type='number']"));
		textphno.sendKeys("8300032276");
		
	}

	
}
