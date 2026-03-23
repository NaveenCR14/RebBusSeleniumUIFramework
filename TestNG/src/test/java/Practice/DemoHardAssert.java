package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	@Test
	public void DemoHardAssertmethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(actualTitle, expectedTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Status : Passed");
		} else {
			System.out.println("Status : Failed");
		}
//		Assert.fail();
//		Assert.assertTrue(expectedTitle.equals(actualTitle),"Comparing the titles");

	}

}
