package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// Context Click
		
	/*	Actions Act=new Actions (driver);
		WebElement Right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Act.contextClick(Right).perform();
		Thread.sleep(5000);  */
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]/span")).click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
