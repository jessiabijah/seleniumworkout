package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot {
	public static void main(String[] args)   {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("https://www.homedepot.com/");
		Actions a = new Actions(driver);
		WebElement dept =driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(dept).perform();
		WebElement heatcool  =driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heatcool).perform();
		WebElement aircondt  =driver.findElement(By.xpath("//a[text()='Air Conditioners'][1]"));
		a.moveToElement(aircondt).perform();
		WebElement portablecondt  =driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		portablecondt.click();
				
}
}
