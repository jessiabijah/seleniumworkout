package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get();
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement txtphno=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtphno.sendKeys("8300032276");
		WebElement btncont=driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btncont.click();
		

		

}
}

