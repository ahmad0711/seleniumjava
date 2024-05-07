package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethod {
	
	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
//		Access these commands through WebElement isDisplayed, isEnabled, isSelected,
		
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension&filter_license=1");
		driver.manage().window().maximize();
		
//		Use of isDisplayed, use to check any type of webelements 
		
		boolean logoStatus = driver.findElement(By.xpath("//img[@title='Opencart extensions']")).isDisplayed();
		
		System.out.println(logoStatus);
		
//		Use of isEnabled, we can use with input, radio buttons, etc
		
		boolean buttonClickable = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).isEnabled();
		
		System.out.println(buttonClickable);
		
//		Use of isSelected - we can use to check element is selected or not 
		
	boolean radioStatus = driver.findElement(By.xpath("//label[normalize-space()='All']//input[@type='radio']")).isSelected();
		
		System.out.println(radioStatus);
		
//		for close the browser
		driver.close();
		
		System.out.println("Test Executed Successfully");
		
	}

}
