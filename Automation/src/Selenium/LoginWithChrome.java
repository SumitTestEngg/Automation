package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithChrome {

	public static void main(String[] args) {
		 System.setProperty("C:\\Program Files\\Java\\chromedriver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.27.0");
		
	}

}