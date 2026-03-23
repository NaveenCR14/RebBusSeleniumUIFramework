package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://doodles.google/");
	
	WebElement ele= driver.findElement(By.xpath("//div[.='When is your birthday?']"));
	JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].scrollIntoView(true)",ele);
	Thread.sleep(3000);
	
	jsExecutor.executeScript("arguments[0].scrollIntoView(false)",ele);
	Thread.sleep(3000);
	
	jsExecutor.executeScript("arguments[0].scrollIntoView()",ele);
	Thread.sleep(2000);
	
	driver.quit();
}
}
