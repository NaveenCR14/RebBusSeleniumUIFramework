package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRectangle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

//		Locating Dimension with Height and width
		WebElement registerLinkElement = driver.findElement(By.linkText("Register"));
		Rectangle rectangle = registerLinkElement.getRect();

//		Fetch Dimension along with Height and width
		System.out.println(rectangle.getDimension());
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.height);
		System.out.println(rectangle.width);

//		Fetching Point coordinates along with x and y offsets
		System.out.println(rectangle.getPoint());
		System.out.println(rectangle.getX());
		System.out.println(rectangle.x);
		System.out.println(rectangle.getY());
		System.out.println(rectangle.y);

		driver.quit();

	}

}
