package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main (String[]args){
		
		ChromeDriver driver = new ChromeDriver();
		
//		We have two types of wait in the selenium
//		implicit wait 
//		explicti wait/fluent wait
	
		driver.get("https://www.orangehrm.com/");
//		Explicit wait work wih the our define condition
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"))).click();
		
		driver.close();
		
		System.out.println("Execuation done");
		
		
	}
	
}
