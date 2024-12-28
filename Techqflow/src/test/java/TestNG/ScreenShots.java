package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		TakesScreenshot Ts= (TakesScreenshot)driver;
		File Loginpage = Ts.getScreenshotAs(OutputType.FILE);
		File LoginTrg = new File("C:\\Users\\hp\\Desktop\\Sumit Gour\\Eclipse Workspace\\Techqflow\\Screenshots\\NewUrl.png");
		FileUtils.copyFile(Loginpage, LoginTrg);
		File LoginTrg1 = new File("C:\\Users\\hp\\Desktop\\Sumit Gour\\Eclipse Workspace\\Techqflow\\Screenshots\\NewUrl.jpg");
		FileUtils.copyFile(Loginpage, LoginTrg1);
	}

}
