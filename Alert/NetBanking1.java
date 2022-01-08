package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetBanking1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://netbanking.hdfcbank.com/netbanking/");
	 WebElement id=driver.findElement(By.xpath("//input[@type='text']"));
	 id.sendKeys("jessi");
	 WebElement btn=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	 btn.click();
	

}
}
