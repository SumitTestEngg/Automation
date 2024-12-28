package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Slider1 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Actions ACT = new Actions(driver);
		ACT.dragAndDropBy(Slider1, 120, 0).perform();
		
		// slider 2
		
		WebElement Slider2 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		ACT.dragAndDropBy(Slider2, 40, 0).perform();
		
		
	}

}
