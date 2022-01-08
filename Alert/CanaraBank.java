package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get( "https://netbanking.canarabank.in/entry/ENULogin.jsp");
	 WebElement btn=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	 btn.click();
	 WebElement btn1=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	 btn1.click();
	 Alert a=driver.switchTo().alert();
      String t=a.getText();
      System.out.println(t);
      a.sendKeys("jessi");
	  a.accept();
	  		 
}
}
		 
 		 