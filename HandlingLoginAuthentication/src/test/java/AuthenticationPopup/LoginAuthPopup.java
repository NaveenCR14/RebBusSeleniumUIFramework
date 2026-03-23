package AuthenticationPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginAuthPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	Thread.sleep(2000);
	driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	Thread.sleep(2000);
	
	driver.quit();
	
}
}
