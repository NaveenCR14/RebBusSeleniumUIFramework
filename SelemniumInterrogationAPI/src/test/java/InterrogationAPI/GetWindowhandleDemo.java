package InterrogationAPI;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowhandleDemo {
	public static void qspiderDemo() {
		WebDriver driver = new EdgeDriver();
		try {

			driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");

			Thread.sleep(2000);
			String initString = driver.getWindowHandle();
			System.out.println("Parent Window ID: " + initString);

			driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//section[text()=\"Browser Windows\"]")).click();
			Thread.sleep(1000);
			// clicking button
			driver.findElement(By.xpath("//h2[text()=\"Watches\"]/../button")).click();

			System.out.println("redirected URL : " + driver.getWindowHandle());
			Set<String> string = driver.getWindowHandles();
			System.out.println("multiple : " + string);

			System.out.println("___________________");
			Thread.sleep(2000);
			System.out.println(driver.getWindowHandle());
			System.out.println("multiple : " + driver.getWindowHandles());
			string.remove(initString);
			System.out.println(string);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			driver.quit();
		}
	}

	public static void main(String[] args) {

		qspiderDemo();

		/*
		 * 
		 * WebDriver driver = new EdgeDriver(); try {
		 * 
		 * 
		 * driver.manage().window().maximize();
		 * driver.get("https://demowebshop.tricentis.com/");
		 * 
		 * Thread.sleep(2000); String initString = driver.getWindowHandle();
		 * System.out.println(initString);
		 * 
		 * // driver.navigate().refresh(); //
		 * driver.navigate().to("https://www.google.com");
		 * driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click(); //
		 * driver.get("https://www.google.com"); Thread.sleep(3000);
		 * System.out.println("redirected URL : " + driver.getWindowHandle());
		 * System.out.println("multiple : " + driver.getWindowHandles());
		 * driver.navigate().back(); //
		 * driver.get("https://demowebshop.tricentis.com/");
		 * 
		 * Thread.sleep(2000); System.out.println(driver.getWindowHandle());
		 * System.out.println("multiple : " + driver.getWindowHandles());
		 * 
		 * } catch (Exception e) { System.out.println(e); } finally { driver.quit(); //
		 * driver.close(); }
		 */
	}

}