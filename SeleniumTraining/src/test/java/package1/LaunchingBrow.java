package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.Dimension;


import org.openqa.selenium.WebDriver;

public class LaunchingBrow {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.get("https://google.com");
		
		
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

		driver1.get("https://google.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
//		System.out.println(driver1.getPageSource());
		Thread.sleep(2000);
//		driver1.close();
		System.out.println(driver1.getWindowHandle());
		System.out.println(driver1.getWindowHandles());
	}
	

}
