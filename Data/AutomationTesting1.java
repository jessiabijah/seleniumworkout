package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTesting1 {
	public static void main(String[] args) {
		// browser----gecko; keyvalue---browserkey;value-----location of driver e
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
		// Instantiation
		WebDriver driver = new FirefoxDriver();
		// to lanuch url---get()
		driver.get("http://demo.automationtesting.in/Register.html");
		// to find a webelement--find element()returntype:WebElement
		WebElement txtaddress = driver
				.findElement(By.id("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		// to pass the value to the required field
		txtaddress.sendKeys("Jessi");
		WebElement txtaddress1 = driver
				.findElement(By.id("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		// to pass the value to the required field
		txtaddress1.sendKeys("Abijah");

	}

}
