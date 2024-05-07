package Testcases;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {
	
	public static void main (String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		
//		We can accsess these methods through webdrivers instances
//		All About Get Method
		
//		Open URL using 
		driver.get("https://www.opencart.com/");
		
//		Maximize Window size
		driver.manage().window().maximize();

//		Get title of the page 
		String title = driver.getTitle();
		System.out.println("This is The title of the page " + title);
		
//		Get Url of the page 
		String url = driver.getCurrentUrl();
		System.out.println("This is The Url of the page " + url);
		
//		Get Page soure 
//		System.out.println(driver.getPageSource());
		
//		windowsHundle, The windowHunder return the id of the browser
		String windowId = driver.getWindowHandle();
		System.out.println ("This is The Window ID the page " + windowId);
		
//		for getting multiple windows id use windowshundles
		
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("This is The windows ID of the page " + windowIds);
		
	}

}
