package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology2 {
	public static void main(String[] args) {
		//browser--chrome;key---browser key;value--location of drive e
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
		//instanciation
		WebDriver driver=new ChromeDriver();
		//to launch url---get()
		driver.get("http://www.greenstechnologys.com/");
        //to find a webelement----find element()returntype--wbelement
		WebElement para=driver.findElement(By.xpath("//p[contains(text(),'leading')]"));
		//to fetch and print the text in the webelement
		String t=para.getText();
		System.out.println(t);
		
		
}
}


