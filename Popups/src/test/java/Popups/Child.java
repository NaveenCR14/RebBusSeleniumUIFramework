package Popups;


import java.awt.event.ActionEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Child {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("Laptops",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-index=\"3\"]")).click();
	Thread.sleep(2000);
	
	
	Set<String> allwindowId =driver.getWindowHandles();
	String parentId= driver.getWindowHandle();
	allwindowId.remove(parentId);
	
	for(String childId : allwindowId){
		driver.switchTo().window(childId);
	}
	driver.findElement(By.xpath("(//input[@data-hover=\"Select <b>__dims__</b> from the left<br> to add to Shopping Cart\"])[2]")).click();
//	Actions action=new Actions(driver);
//	action.scrollToElement(addToCart);
////	
//	driver.findElement(By.xpath("(//inxput[@data-hover=\"Select <b>__dims__</b> from the left<br> to add to Shopping Cart\"])[2]")).click();
	Thread.sleep(2000);
	
	driver.quit();
	
	
	}
}
