package org.Data;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class AutomationTesting {
	public static void main(String[] args) {
		//browser----gecko; keyvalue---browserkey;value-----location of driver e
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
		//Instantiation
		WebDriver driver =new FirefoxDriver();
		//to lanuch url---get()
		driver.get("http://demo.automationtesting.in/Register.html");
		//to find a webelement--find element()returntype:WebElement
		WebElement txtdiv =driver.findElement(By.xpath("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")); 
		//to pass the value to the required field
		 txtdiv.sendKeys("Jessi");
		 WebElement div1 =driver.findElement(By.xpath("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")); 
		 div1.sendKeys("Abijah");
		 WebElement txtadress =driver.findElement(By.xpath("form-control ng-pristine ng-valid ng-touched")); 
		 txtadress.sendKeys("rajakilpakkam");
		 WebElement txtid   =driver.findElement(By.xpath("//textarea[@ng-model='EmailAdress']")); 
		 		 txtid.sendKeys("jessiabijah@gmail.com");
		 		WebElement txtphno =driver.findElement(By.xpath("//input type[@ng-model='Phone']"));
		 		txtphno.sendKeys("7893345567");

}
}
