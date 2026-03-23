package HandlingFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	Thread.sleep(2000);
	
	driver.findElement(By.id("resume")).sendKeys("F:\\Documents\\NaveenKumar C B Resume.pdf");
	Thread.sleep(2000);
	
	driver.quit();
}
}
