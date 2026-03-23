package JavaScriptPopus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.cssSelector("[class=\"button-1 search-box-button\"]"));
		search.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[id=\"small-searchterms\"]")).sendKeys("Computers");
		Thread.sleep(2000);

		search.click();
		Thread.sleep(2000);

		driver.quit();
	}
}
