package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement frame1= driver.findElement(By.id("singleframe"));
	    driver.switchTo().frame(frame1);
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Sumit");
	    
		
		
	}

}
