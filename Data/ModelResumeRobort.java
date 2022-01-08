package org.Data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelResumeRobort {
	public static void main(String[] args) throws AWTException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement txtquestion =driver.findElement(By.xpath("//div[@data-target='#collapse201']"));
	Actions a=new Actions(driver);
	txtquestion.click();
	Robot r = new Robot();
	for (int i = 0; i < 4; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	a.contextClick().perform();
	for (int i = 0; i < 3; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}

