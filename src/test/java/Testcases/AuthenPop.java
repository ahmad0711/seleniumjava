package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenPop {
	
	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth"; // Include username and password in the URL
        driver.get(url);
		
		driver.manage().window().maximize();
		
		
		
	}

}
