package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
	
		/* driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		
		Thread.sleep(3000);
		
		 Alert alert = driver.switchTo().alert();
		 
		 System.out.println(alert.getText());
		 
		 alert.accept(); */
		
//		If the Alter have two option then like confrim or cancled 
		
		
		/*  driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(3000); 
	
		 System.out.println(alert.getText());
		 
	
		 alert.accept();	*/
		
//		For hundlind prompt 
		 
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		
		 
		 Alert prompt = driver.switchTo().alert();
		 Thread.sleep(5000); 
	
		 prompt.sendKeys("Ahmad");
		 Thread.sleep(5000); 
		 
		 
		 prompt.accept();
		
		 
		driver.close();
		
	}
}
