package HandlingFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()=\"  I have work experience (excluding internships)\"]/../..")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("F:\\Documents\\NaveenKumar C B Resume.pdf");
		Thread.sleep(2000);

		driver.quit();

	}
}
