package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleAccount {
	public static void main(String[] args) {
		 //browser--edgebrowser, key---browserkey, value-location of driver e
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		//Instantiation
		WebDriver driver=new EdgeDriver();
		driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp"); 
		WebElement textname=driver.findElement(By.xpath("//input[@name='firstName']"));
		textname.sendKeys("Jessi");
		textname.click();
		WebElement textlastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		textlastname.sendKeys("Abijah");
		WebElement textemail=driver.findElement(By.xpath("//input[@type='email']"));
		textemail.sendKeys("jessiabijah52");
		WebElement txtpassword=driver.findElement(By.xpath("//input[@type='password']"));
		txtpassword.sendKeys("jessi1233");
		

	}		
}


	




