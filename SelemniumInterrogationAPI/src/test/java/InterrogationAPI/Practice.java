package InterrogationAPI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		String initString = driver.getWindowHandle();

		String fbString = "", xString = "";
		System.out.println("Parent ID : " + initString);

		driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click();

		Thread.sleep(3000);

		for (String s : driver.getWindowHandles()) {
			if (!s.equals(initString)) {
				fbString = s;
				break;
			}
		}

		driver.findElement(By.xpath("//a[text()=\"Twitter\"]")).click();

		Thread.sleep(3000);

		for (String s : driver.getWindowHandles()) {
			if (!s.equals(initString) && !s.equals(fbString)) {
				xString = s;
				break;
			}
		}

		System.out.println("Current ID : " + driver.getWindowHandle());
		System.out.println("FB ID : " + fbString);
		System.out.println("X ID : " + xString);

		System.out.println("multiple : " + driver.getWindowHandles());
	}

}
