package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingNewWinodw {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/");
	System.out.println("Parent ID : "+driver.getWindowHandle());
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.WINDOW);	
	driver.get("https://www.youtube.com/");
	System.out.println("Current ID : "+driver.getWindowHandle());
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
