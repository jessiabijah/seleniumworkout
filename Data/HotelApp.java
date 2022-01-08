package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		WebElement textname =driver.findElement(By.id("username"));
		textname.sendKeys("jessiabijah@gmail.com");
		WebElement textphno =driver.findElement(By.id("password"));
		textphno.sendKeys("8309732256");
	}
	}


