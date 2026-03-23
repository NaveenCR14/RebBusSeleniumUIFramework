package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");

//	Using click and hold
		
		WebElement ele = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		
		act.clickAndHold(ele).pause(4000).release().perform();
		act.moveToElement(ele).clickAndHold().pause(4000).release().perform();

		Thread.sleep(4000);
		driver.quit();
	}
}
