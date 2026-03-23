package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement radio = driver.findElement(By.id("pollanswers-2"));

//		Verifying the button is selected
		System.out.println("Is the Button selected :" + radio.isSelected());

//		Click the button and verify the button
		radio.click();
		System.out.println("After Clicking");
		System.out.println("Is the Button selected :" + radio.isSelected());

	}

}
