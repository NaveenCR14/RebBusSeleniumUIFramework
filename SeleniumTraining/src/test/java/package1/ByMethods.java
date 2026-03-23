package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
    driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

//    driver.switchTo().newWindow(WindowType.TAB);
//    driver.get("https://facebook.com");
//    driver.findElement(By.id("email")).sendKeys("test@example.com");
    
//    driver.switchTo().newWindow(WindowType.TAB);
//    driver.get("https://instagram.com");
//    Thread.sleep(6000);
//    driver.findElement(By.id("loginForm")).click();
    
//    driver.switchTo().newWindow(WindowType.TAB);
//    driver.get("https://myaccount.google.com/");
//    Thread.sleep(6000);
//    driver.findElement(By.id("identifierId")).sendKeys("email");
    
	
}
}
