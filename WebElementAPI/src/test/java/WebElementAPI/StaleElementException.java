package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("Mobile");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
//		Get StaleElementException 
		searchTF.sendKeys("Mobile");

//		No Exception
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");

	}
}
