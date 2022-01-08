package org.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Shopclues {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get(" https://www.shopclues.com/wholesale.html ");
		WebElement txtname = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		txtname.sendKeys("womenkurti");
		txtname.click();
		WebElement txtprod = driver.findElement(By.xpath("//img[@title='BLANCORA Women's Digital Print 3/4th Sleeve Multicolor Straight Crepe Stitched Kurti']"));		
				
}
}
