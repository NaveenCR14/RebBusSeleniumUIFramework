package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Point;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

//		Locate the search text field 
		WebElement searchElement = driver.findElement(By.name("q"));

//		Fetching the Location
		Point loc = searchElement.getLocation();
		System.out.println(loc);

//		Fetch x offset
		System.out.println(loc.getX());
		System.out.println(loc.x);

//		fetch y offset
		System.out.println(loc.getY());
		System.out.println(loc.y);

		driver.quit();

	}
}
