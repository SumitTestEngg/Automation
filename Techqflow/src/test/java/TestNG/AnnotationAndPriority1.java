package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnotationAndPriority1 {
	 WebDriver driver;
	   @Test(priority=1)
	   void OpenApp() {
		   driver=new EdgeDriver();
		   driver.get("https://demo.guru99.com/V4");   
	   }
	   @Test(priority=2,dependsOnMethods= {"OpenApp"})
		void Login() {
			driver.findElement(By.name("uid")).sendKeys("mngr546335");
			driver.findElement(By.name("password")).sendKeys("a1!");
			driver.findElement(By.name("btnLogin")).click();
		}
		@Test(priority=3,dependsOnMethods= {"Login"})
	   void Search() {
		   System.out.println("This For Searching....");
	   }
	   @Test(priority=4,dependsOnMethods= {"OpenApp"})
		void CloseApp() {
			driver.close();
		}
	
	
}
