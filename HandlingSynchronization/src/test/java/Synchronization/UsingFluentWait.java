package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingFluentWait{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/34");
//	Locating 
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	WebElement checkbtn = driver.findElement(By.id("Check"));

//	Giving a fluent wait to check if the condition is satisfied
	FluentWait wait =new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.withTimeout(Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(checkbtn));
	checkbtn.click();
}
}
