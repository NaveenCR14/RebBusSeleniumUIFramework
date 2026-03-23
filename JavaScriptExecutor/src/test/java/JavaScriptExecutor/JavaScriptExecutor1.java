package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://timesofindia.indiatimes.com/");

//		Scrolling by using scrollto
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");

//		Scrolling by using scrollto
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1500)");

		driver.quit();

	}
}
