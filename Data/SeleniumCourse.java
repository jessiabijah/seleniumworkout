package org.Data;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCourse {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			WebElement txtquestion =driver.findElement(By.xpath("//div[@id='heading201']"));
			txtquestion.click();
			WebElement txtresum =driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
			txtresum.click();
		   

}
}
