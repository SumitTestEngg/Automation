package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginTest {

	public static void main(String[] args) {
		

		System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("sumitgourr92@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("signinbtn")).click();
	}

}