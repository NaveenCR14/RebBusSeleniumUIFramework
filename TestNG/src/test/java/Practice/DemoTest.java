package Practice;

import java.lang.reflect.Method;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class DemoTest extends BaseClass{

	@Test(priority = 0)
	public void logInTest(Method m1) {
		System.out.println("Executing " + m1.getName());
	}

	@Test(dependsOnMethods = "logInTest")
	public void addEmployee(Method m2) {
		System.out.println("Executing " + m2.getName());
	}

	@Test(dependsOnMethods = "logInTest")
	public void logOutTest(Method m3) {
		System.out.println("Executing " + m3.getName());
	}
}
