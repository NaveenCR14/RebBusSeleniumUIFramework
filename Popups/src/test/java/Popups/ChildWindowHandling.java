package Popups;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//h2[text()='Laptop']/..//button ")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();

		allwindowId.remove(parent);
		for (String childId : allwindowId) {
			driver.switchTo().window(childId);
		}

		driver.findElement(By.cssSelector(
				"[class=\"bg-orange-600 text-white px-6 py-2 rounded-lg hover:bg-orange-700 transition duration-200\"]"))
				.click();
		driver.findElement(By.cssSelector(
				"[class=\"bg-orange-600 text-white px-6 py-2 rounded-lg hover:bg-orange-700 transition duration-200\"]"))
				.click();
		driver.findElement(By.cssSelector("[class=\"text-[40px] absolute top-0 right-0 text-orange-500\"]")).click();
		System.out.println("Shopping Cart Is Displayed : "+driver.findElement(By.tagName("h2")).isDisplayed());
		Thread.sleep(2000);

		driver.quit();
	}
}
