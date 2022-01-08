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

public class VelMurganDoubleClick {
	public static void main(String[] args) throws AWTException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.google.co.in/webhp" );
		WebElement txtname=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Actions a =new Actions(driver);
		a.sendKeys(txtname,"Vel Murugan").perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);	
		r.keyRelease(KeyEvent.VK_X);	
		r.keyRelease(KeyEvent.VK_X);
		

		
}
}






