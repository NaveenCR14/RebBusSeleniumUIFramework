package com.redbus.testing.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.redbus.testing.utilities.AllUtilityFunction;
import com.redbus.testing.utilities.Base;
import com.redbus.testing.utilities.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends AllUtilityFunction {

	AllUtilityFunction util = new AllUtilityFunction();

	@Before
	public void setup(Scenario scenario) throws IOException {

		initPropertiesUtility("src/test/resources/Reader/CommonProp.properties");

		WebDriver driver = new EdgeDriver();

		Base.setDriver(driver);

		String URL = getPropertyData("url");
		Base.getDriver().get(URL);
		setMaximizeBrowser(driver);
		implicitlyWait(driver, 15);

		Pages.loadAllPages(driver);

	}

	@After
	public void tearDown(Scenario scenario) {

		Base.getDriver().quit();
		Base.removeDriver();
	}
}