package org.Data;

import java.awt.AWTException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelapp2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='username']"));
		txtemail.sendKeys("aksharaje");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
		location.click();
		Select place=new Select(location);
		place.selectByIndex(6);
		WebElement btn=driver.findElement(By.xpath("//input[@id='Submit']"));
		btn.click();
		WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio'][1]"));
		radiobtn.click();
		WebElement contbtn=driver.findElement(By.xpath("//input[@id='continue']")); 
		contbtn.click();
		WebElement txtname = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtname.sendKeys("jessi");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("abi");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("chennai");
		WebElement creditnum = driver.findElement(By.xpath("//input[@id='cc_num']"));
		creditnum.sendKeys("2345678902345678");
		WebElement cctype=driver.findElement(By.xpath("//select[@id='cc_type']"));
		cctype.click();
		Select s=new Select(cctype);
		s.selectByIndex(2);
		WebElement month =driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		month.click();
		Select s1=new Select(month);
		s1.selectByIndex(2);
		WebElement year =driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		year.click();
		Select s2=new Select(year);
		s2.selectByValue("2021");
		WebElement cvvnum = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvvnum.sendKeys("23456789");
		}
}
			
		
		
		
		



	
	
