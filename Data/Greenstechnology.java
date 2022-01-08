package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstechnology {

	public static void main(String[] args) {

		// browser----chrome;key---browserkey; value----location of driver e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// Instantiation
		WebDriver driver = new ChromeDriver();
		// to launch url--get
		driver.get("https://www.google.com/");
		// to find a webelement---find element()returntype:webelement
		WebElement txtaddress = driver.findElement(By.name("q"));
		// to pass the value for particular field
		txtaddress.sendKeys("GreensTechnology");
	}

}
