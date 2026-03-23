package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[class=\"izooto-optin--cta izooto-optin--cta-later\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"[class=\"ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//div[@class=\"ui-datepicker-group ui-widget-content ng-tns-c69-9 ng-star-inserted\"]/descendant::a[9]"))
				.click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(
				"[class=\"ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]"))
				.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(
				"//div[@class=\"ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c69-9\"]/following::a[text()='11']"))
				.click();
		Thread.sleep(3000);
		

		driver.quit();
	}
}
