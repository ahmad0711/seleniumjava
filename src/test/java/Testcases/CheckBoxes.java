package Testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
//		for single checkbox
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(int i=0; i<checkbox.size(); i++)
//		{
//			checkbox.get(i).click();
//			
//		}
		
//		another technique select all checkbox
		
		for(WebElement checkbox:checkboxs) {
			checkbox.click();
		}
		
//		check last 3 check boxes 
		
		for(int i=4; i<checkboxs.size();i++) {
			checkboxs.get(i).click();
		}
		
		
		
	}
}
