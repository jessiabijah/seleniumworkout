package org.Data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbRobot {
	public static void main(String[] args) throws AWTException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");
		Actions a =new Actions(driver);
		
		WebElement txtEmail=driver.findElement(By.id("email"));
		a.sendKeys(txtEmail,"jessiabijah").perform();
		a.doubleClick(txtEmail).perform();
		a.contextClick(txtEmail).perform();
		Robot r=new Robot();
		for (int i = 0; i <=3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		r.keyPress(KeyEvent.VK_TAB);	
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}




	     	
	    		
	

	

	
	