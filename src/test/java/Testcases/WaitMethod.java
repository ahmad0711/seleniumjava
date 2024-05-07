package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WaitMethod {

	public static void main (String[]args){
		
		ChromeDriver driver = new ChromeDriver();
		
//		We have two types of wait in the selenium
//		implicit wait 
//		explicti wait/fluent wait
		
		
//		Implicit Wait (use only in the one time)
//		these 5 second wait of implicit wait is apply every activity of the code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		5 second wait on the every activity if the element not available means load proper 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		if the element is not availabe then 5 second wait is apply of implicity wait 
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		
	}
	
}
