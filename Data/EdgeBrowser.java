package org.Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		//browser--edgebrowser, key---browserkey, value-location of driver e
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe" );
		
		//instanciation
		WebDriver driver=new EdgeDriver();
		
		//to lanuch url
		driver.get(" http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		//to close browser
		driver.close();
	}
}