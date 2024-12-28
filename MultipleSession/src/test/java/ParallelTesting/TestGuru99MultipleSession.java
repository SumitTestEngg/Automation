package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestGuru99MultipleSession {
WebDriver driver;
@Test(priority=1)
public void executeSessionOne() {
  System.setProperty("C:\\Program Files\\Java\\chromedriver","chromedriver.exe");
	
  driver = new ChromeDriver();
  driver.get("http://demo.guru99.com/V4/");
  driver.manage().window().maximize();
}

@Test(priority=2)
public void executeSessionTwo() {
  driver = new EdgeDriver();
  driver.get("http://demo.guru99.com/V4/");
  driver.manage().window().maximize();
}

@Test(priority=3)
public void executeSessionThree() {
  driver = new FirefoxDriver();
  driver.get("http://demo.guru99.com/V4/");
  driver.manage().window().maximize();
}




}