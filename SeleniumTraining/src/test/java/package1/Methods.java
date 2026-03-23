package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods { 
	public static void main(String[] args) throws InterruptedException {
		String browser="edge";
		WebDriver driver1=null;
		if(browser.contains("edge")){
			driver1 =new EdgeDriver();
		}
		else if(browser.contains("firefox")) {
			driver1 =new FirefoxDriver();	
		}
		else if(browser.contains("chrome")){
			driver1 =new ChromeDriver();
		}
		
		
		driver1.manage().window().maximize();
		driver1.get("https://www.youtube.com");
		Thread.sleep(2000);
//		System.out.println(driver1.getPageSource());
		System.out.println("Title : "+ driver1.getTitle());
		System.out.println("Current URL : "+ driver1.getCurrentUrl());
		System.out.println("Session ID1 : "+driver1.getWindowHandle());
//		driver1.quit();
//		driver1.get("https://google.com");
		driver1.findElement(By.linkText("YouTube Music")).click();
		Thread.sleep(2000);
//		System.out.println(driver1.getPageSource());
		System.out.println("Title : "+ driver1.getTitle());
		System.out.println("Current URL : "+ driver1.getCurrentUrl());
		System.out.println("Session ID2 : "+driver1.getWindowHandle());
		
		
		driver1.findElement(By.linkText("YouTube Music")).click();
		Thread.sleep(2000);
//		System.out.println(driver1.getPageSource());
		System.out.println("Title : "+ driver1.getTitle());
		System.out.println("Current URL : "+ driver1.getCurrentUrl());
		System.out.println("Session ID3 : "+driver1.getWindowHandle());
		driver1.close();
		
//		driver1.get("https://www.google.com");
//		Thread.sleep(2000);
//		System.out.println("Title : "+ driver1.getTitle());
//		System.out.println("Current URL : "+ driver1.getCurrentUrl());
//		System.out.println(driver1.getPageSource());
//		driver1.close();
//		System.out.println("Session  ID2 : "+driver1.getWindowHandle());
//		
//		System.out.println("Sessions : "+driver1.getWindowHandles());
		
		
	}

}
