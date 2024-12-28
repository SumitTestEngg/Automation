package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		

		WebDriver driver = new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		

		driver.findElement(By.name("text1")).sendKeys("Welcome to Selenium");
		Actions ACT = new Actions(driver);
		ACT.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		// selecting text
		ACT.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		// Copying text
		ACT.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// changing tab
		ACT.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		// Pasting Text
		
		driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
		
		
		
		
	}

}
