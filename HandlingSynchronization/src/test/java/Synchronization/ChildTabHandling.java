package Synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildTabHandling {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.linkText("Open In New Tab")).click();
		
		Set<String> allIdSet=driver.getWindowHandles();
		allIdSet.remove(driver.getWindowHandle());
		for(String s:allIdSet) {
			driver.switchTo().window(s);
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		}
		System.out.println("Handled child Tab");
		
	} finally {
		// TODO: handle finally clause
		driver.quit();
	}
	
	
}
}
