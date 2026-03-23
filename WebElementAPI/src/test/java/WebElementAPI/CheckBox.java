package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(20000);

//	Clicking on the Cricket
		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();
		Thread.sleep(3000);

//	Gets InvalidElementStateException
//	cricket.clear();

//	Unselect the checkbox
		cricket.click();

	}
}
