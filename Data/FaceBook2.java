package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook2 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get()
		driver.get( "https://www.facebook.com/ ");
		//to find a webelement----find element()returntype--wbelement
				WebElement txtEmail=driver.findElement(By.xpath("//input[@type='text']"));
				txtEmail.sendKeys("jessiabijah@gmail.com");
				WebElement txtpassword=driver.findElement(By.xpath("//input[@type='password']"));
				txtpassword.sendKeys("jes45565");
				String s=txtEmail.getAttribute("value");
				System.out.println(s);
				String a=txtpassword.getAttribute("value");
                 System.out.println(a);

				

}
}
