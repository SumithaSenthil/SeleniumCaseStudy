package SeleniumCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class Login {
	
	static WebDriver driver;
	@Test
	public static void OpenCar() throws InterruptedException {
		driver=Helper.startBrowserDemo("Chrome");
		
		driver.manage().window().maximize();
		//5.Login To "https://demo.opencart.com/index.php?route=account/login&language=en-gb"
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		driver.findElement(By.id("input-email")).sendKeys("sumitha410@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Monu@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        driver.close();
	}
}
