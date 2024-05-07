package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class First {

	public static void main (String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
//		maximize window
		
		driver.manage().window().maximize();
		
//		FindElement
		
//		driver.findElement(By.id("APjFqb")).sendKeys("QA");
		
		boolean logostatus = driver.findElement(By.className("navbar-brand")).isDisplayed();
		
		System.out.println(logostatus);
		
		
		driver.close();
		
		
	}
}
