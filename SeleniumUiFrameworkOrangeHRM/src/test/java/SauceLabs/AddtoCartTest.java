package SauceLabs;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddtoCartTest extends BaseClass {

	@Test(priority = 1)
	public void logInTest() {
		WebElement swagLabsText = driver.findElement(By.xpath("//div"));
		if (swagLabsText.getText().contains("Swag Labs")) {
			Reporter.log("Login Successful", true);
		} else {
			System.out.println("Login Failed");
		}
	}

	@Test(priority = 2, dependsOnMethods = "logInTest")
	public void AddToCart() {
		// 1. Add items to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		// 2. Navigate to cart
		driver.findElement(By.id("shopping_cart_container")).click();

		// 3. Find items (Corrected locator: simple class name)
		List<WebElement> products = driver.findElements(By.className("cart_item"));

		// 4. Verify contents
		List<String> list = new ArrayList<String>();

		for (WebElement e : products) {
//			System.out.println(e.getText());
			list.add(e.getText());
		}
		String[] str = { "Backpack", "Bike" };
		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(str[i]))
				flag++;
		}
		if (flag == list.size())

			Reporter.log("Expected Products are added", true);
		else
			System.out.println("Not added");
	}

	@Test(priority = 3, dependsOnMethods = "logInTest")
	public void logOutTest() {
		WebElement ele = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if (ele.getText().equals("Swag Labs")) {
			Reporter.log("logout verified");
		} else {
			Reporter.log("logout Failed");
		}
	}

	@Test(priority = Integer.MAX_VALUE)
	public void quit() {
		driver.quit();
	}

}
