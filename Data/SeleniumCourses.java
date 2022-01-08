package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumCourses {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txthead =driver.findElement(By.xpath("//div[@id='heading20']"));
		txthead.click();
		WebElement txtques =driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		txtques.click();
		
	}
	

}


