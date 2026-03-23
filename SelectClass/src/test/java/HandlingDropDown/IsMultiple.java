package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);

		List<WebElement> list = driver.findElements(By.tagName("select"));
		for (WebElement e : list) {
			Select select = new Select(e);
			System.out.println("Multi Select : " + select.isMultiple());
		}

		driver.quit();
//		WebElement option = driver.findElement(By.cssSelector("[name=\"cars\"]"));
//		Select select = new Select(option);
//		System.out.println("Multi Select for cars : " + select.isMultiple());
//
//		WebElement option1 = driver.findElement(By.cssSelector("[id=\"oldSelectMenu\"]"));
//		Select select1 = new Select(option1);
//		System.out.println("Multi Select for colors : " + select1.isMultiple());
	}
}
