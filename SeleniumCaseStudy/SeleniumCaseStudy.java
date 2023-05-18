package SeleniumCaseStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class SeleniumCaseStudy {
	static WebDriver driver;
	@Test
	public static void OpenCar() throws InterruptedException {
		driver=Helper.startBrowserDemo("Chrome");
		
		driver.manage().window().maximize();

		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.id("input-firstname")).sendKeys("Sumitha");
		driver.findElement(By.id("input-lastname")).sendKeys("Senthil");
		driver.findElement(By.id("input-email")).sendKeys("sumitha410@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Monu@123");
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");

	
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title=driver.getTitle();
		
		if (title.equals("Register Account")) {
			System.out.println("Verification - TestCase Passed...!");
		
		}else {
			System.out.println("Verification - TestCase Failed...!");
		}
	
		
		driver.close();
			
		
		
	}

	

}
