package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy1 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get();
		driver.get("https://www.swiggy.com/");
		WebElement txtsignin=driver.findElement(By.xpath("//a[@class='r2iyh']"));
		txtsignin.click();
		WebElement txtphno=driver.findElement(By.xpath("//input[@class='_381fS']"));
        txtphno.sendKeys("8300032276");
        WebElement txtname=driver.findElement(By.xpath("//input[@id='name']"));
        txtname.sendKeys("jessi");
        WebElement txtEmail=driver.findElement(By.xpath("//input[@id='email']"));
        txtEmail.sendKeys("jessiabijah@gmail.com");
        WebElement txtpassword=driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("8300032");
		
				

}
}