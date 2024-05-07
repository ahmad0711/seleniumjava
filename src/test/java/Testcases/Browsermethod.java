package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {

	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
//		We have only two Browser Method 
//		close()
//		quit()
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		use for wait 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(5000);
		
//		This Method is close only the prent tab not the second tab
		driver.close();
		
//		if we want to close the all windows then use this 
		
		driver.quit();
		
		
	}
}
