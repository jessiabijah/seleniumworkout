package org.Data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
		WebElement prod=driver.findElement(By.xpath("//input[@name='keyword'][1]"));
		prod.sendKeys("Watches");
		Thread.sleep(2000);
		WebElement watch=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		watch.click();
		Thread.sleep(2000);
		WebElement wat=driver.findElement(By.xpath("//img[@class='product-image '][1]"));
		a.contextClick(wat).perform();
		Robot r=new Robot();
		for (int i = 0; i <2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		for (int i = 0; i<2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
}





		

}
