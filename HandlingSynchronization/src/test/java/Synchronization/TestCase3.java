package Synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();

		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.cssSelector("[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();

		String parentID = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		all.remove(parentID);
		String youtubeid="";
		for (String i : all) {
			driver.switchTo().window(i);
			if (driver.getTitle().contains("YouTube")) {
				
				youtubeid = driver.getWindowHandle();
				break;
			}

		}
		driver.switchTo().window(youtubeid);
		driver.findElement(By.cssSelector("[class=\"ytSearchboxComponentInput yt-searchbox-input title\"]")).sendKeys("Apudi podu song",Keys.ENTER);
		
		
		System.out.println("Successful");

	}
}
