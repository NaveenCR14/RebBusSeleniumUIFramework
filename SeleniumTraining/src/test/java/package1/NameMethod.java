package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NameMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(3000);
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
//	
//	driver.get("https://www.pinterest.com/login/");
//
//	WebElement email = driver.findElement(By.id("email"));
//	WebElement password = driver.findElement(By.id("password"));
//	
//	driver.get("https://www.paypal.com/signin");
//
//	WebElement email1 = driver.findElement(By.id("email"));
//	
//	
//	driver.get("https://www.quora.com/login");
//
//	WebElement email2 = driver.findElement(By.id("email"));
//	WebElement password2 = driver.findElement(By.id("password"));
	
	driver.get("https://accounts.spotify.com/en/login");
	Thread.sleep(3000);

	 driver.findElement(By.id("username")).sendKeys("nn");

	
}
}
