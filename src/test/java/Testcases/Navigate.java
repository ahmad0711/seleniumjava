package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		
		driver.findElement(By.xpath("//div[@class='home-banner-button']//a[@class='btn blue-button'][normalize-space()='Get started']")).click();
		
		driver.manage().window().maximize();

//		use to back to previouse page 
		driver.navigate().back();
	
//		use to forward page 
		driver.navigate().forward();
		
//		use to refresh the page 
		driver.navigate().refresh();
		
//		use to close window
		driver.quit();
		
		
	}
}
