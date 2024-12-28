package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		
		
		Select title = new Select (driver.findElement(By.id("user_title")));
		
		// By Index
		
		title.selectByIndex(0);
		Thread.sleep(3000);
	 
		// By Value
		
		title.selectByValue("Doctor");
		Thread.sleep(3000);
		
		// By Visible Text
		
		title.selectByVisibleText("Captain");
		
		
		
		
		
	
	
	
	}
	

}
