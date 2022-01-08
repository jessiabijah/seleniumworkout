package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBankAccount {
	public static void main(String[] args) {
		// browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// instanciation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch url---get();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions(driver);
		WebElement scr = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(scr, dest).perform();
		WebElement scr1 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement dest1 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		a.dragAndDrop(scr1, dest1).perform();
		

	}
	}







