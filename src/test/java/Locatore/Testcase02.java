package Locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase02 {

	public static void main (String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='home-banner-button']//a[@class='btn blue-button'][normalize-space()='Get started']")).click();
		
		driver.close();
	}
}
