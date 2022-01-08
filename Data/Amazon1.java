package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get(" https://www.amazon.in/");
		WebElement textmaterials=driver.findElement(By.xpath("//select[@name='url']"));
		textmaterials.sendKeys("Gift Cards");
		WebElement textsearch=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		textsearch.click();
}
}
