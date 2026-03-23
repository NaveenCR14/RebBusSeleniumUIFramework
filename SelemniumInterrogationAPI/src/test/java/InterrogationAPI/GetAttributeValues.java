package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("small-searchterms"));

		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		System.out.println("------------------------------");

		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		System.out.println("------------------------------");

		search.sendKeys("Mobile");
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));

		driver.quit();

	}
}
