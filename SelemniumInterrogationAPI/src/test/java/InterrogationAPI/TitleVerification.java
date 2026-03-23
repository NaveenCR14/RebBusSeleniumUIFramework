package InterrogationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

//		Verify the title with Expected Title and Actual Title
		String expectedTitle = "Demo Web Shop";
		String actualTitle = driver.getTitle();
		System.out.println("Tile : "+actualTitle);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Successful");
		} else {
			System.out.println("Failed");
		}
		
//		Verify the current URL and Actual URL
		
		String actualURLString= driver.getCurrentUrl();
		String expectedURlString="https://demowebshop.tricentis.com/";
		System.out.println("URL : "+actualURLString);
		
		if (expectedURlString.equals(actualURLString)) {
			System.out.println("Successful");
		} else {
			System.out.println("Failed");
		}
		

		driver.quit();

	}

}
