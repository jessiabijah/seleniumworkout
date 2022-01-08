package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page ");

		WebElement txtName=driver.findElement(By.className("             qF0y9          Igw0E   rBNOH          YBx95   ybXk5   vwCYk              MGky5                                                              i0EQd                                   "));           
				
		txtName.sendKeys("adlin shannu");
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtPassword.sendKeys("yhgtuy");
}
}
