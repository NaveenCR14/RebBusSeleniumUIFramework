package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		WebElement searchbutton = driver.findElement(By.cssSelector("[class=\"button-1 search-box-button\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Mobiles';", searchbox);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", searchbutton);
		Thread.sleep(2000);
		driver.quit();

	}
}
