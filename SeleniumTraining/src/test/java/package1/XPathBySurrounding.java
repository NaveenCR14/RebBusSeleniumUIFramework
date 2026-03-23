package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathBySurrounding {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()=\"Build your own cheap computer\"]/../../div[@class=\"add-info\"]/div[@class=\"buttons\"]//input"))
//		.click();
//		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
		
		
		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Samsung']/..//input")).click();
		driver.findElement(By.xpath("//label[text()='Iphone']/..//input")).click();
		
	}

}
