package com.orangeHRM.seleniumUI.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	Username TextField
	@FindBy(name = "username")
	private WebElement usernameInput;

	@FindBy(name = "password")
	private WebElement passwordInput;

	@FindBy(css = "[type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//p[.='Forgot your password? ']")
	private WebElement forgotPwd;

	@FindBy(css = "[href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")
	private WebElement linkedLink;

	@FindBy(css = "[href=\"https://www.facebook.com/OrangeHRM/\"]")
	private WebElement facebookLink;

	@FindBy(css = "href=\"https://twitter.com/orangehrm?lang=en\"")
	private WebElement twitterLink;

	@FindBy(css = "href=\"https://www.youtube.com/c/OrangeHRMInc\"")
	private WebElement youtubeLink;

	public WebElement getUsernameInput() {
		return usernameInput;
	}

	public void setUsernameInput(String validUserName) {
		getUsernameInput().sendKeys(validUserName);
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public void setPasswordInput(String validPassword) {
		getPasswordInput().sendKeys(validPassword);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void clickLoginButton() {
		getLoginButton().click();
	}

	public WebElement getForgotPwd() {
		return forgotPwd;
	}

	public void clickForgotPwd() {
		getForgotPwd().click();
	}

	public WebElement getLinkedLink() {
		return linkedLink;
	}

	public void clickLinkedLink() {
		getLinkedLink().click();
	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}

	public void clickFacebookLink() {
		getFacebookLink().click();
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public void clickTwitterLink() {
		getTwitterLink().click();
	}

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	public void clickYoutubeLink() {
		getYoutubeLink().click();
	}

	public void enterURL(String url) {
		driver.get(url);
	}

	public void performLogin(String ValidUsername, String validPassword) {
		setUsernameInput(ValidUsername);
		setPasswordInput(validPassword);
		clickLoginButton();

	}
}