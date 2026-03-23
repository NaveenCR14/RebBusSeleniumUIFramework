package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert 
{
	@Test
	public void DemoSoftAssertMethod() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String expectedTitle = "Google";
		String actualTitle = "Google";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Status : Passed");
		}
		else 
		{
			System.out.println("Status : Failed");
		}
		sa.assertAll();
			
		
	}

}