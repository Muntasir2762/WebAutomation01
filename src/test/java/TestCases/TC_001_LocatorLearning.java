package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BasePackage.DriverSetup;

public class TC_001_LocatorLearning extends DriverSetup{
	
	public static String baseurl="https://rahulshettyacademy.com/locatorspractice";

	@Test
	public static void LocateElement() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Pranto");
		Thread.sleep(3000);
		
		driver.findElement(By.name("inputPassword")).sendKeys("Asma");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(3000);

		
	}
}
