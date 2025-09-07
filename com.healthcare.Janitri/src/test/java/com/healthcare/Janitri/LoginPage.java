package com.healthcare.Janitri;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.FileUtility;
import ObjectRepository.JanitriLoginPage;

public class LoginPage extends BaseClass {

//	 Test Scenarios to Automate (without valid credentials)

	@Test
	public void testLoginButtonDisabledWhenFieldAreEmpty() {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		if (loginPg.getLoginButton().isEnabled()) {
			System.out.println("test LoginButton is disabled as Fields are empty");
		} else {
			System.out.println("test LoginButton is enabled as Fields are not empty");
		}

	}

//	Validate password masking/unmasking toggle 
	@Test
	public void testPasswordMaskedbutton() throws IOException {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		f= new FileUtility();
		String password = f.readDataFromPropertyFile("password");
		loginPg.getLoginPassword().sendKeys(password);
		String beforeToggle = loginPg.getLoginPassword().getAttribute("type");
		loginPg.loginEyeIcon(driver);
		String afterToggle = loginPg.getLoginPassword().getAttribute("type");
		if (!beforeToggle.equals(afterToggle)) {
			System.out.println("Password masked button is working" + afterToggle + " - " + beforeToggle);
		}
	}

//	Enter any random credentials and click login – capture and print any error message shown 
	@Test
	public void testInvalidLoginShowErrorMsg() throws InterruptedException, IOException {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		f= new FileUtility();
		String userID = f.readDataFromPropertyFile("userid");
		String password = f.readDataFromPropertyFile("password");
		loginPg.loginUserId(driver, userID);
		loginPg.loginPassword(driver, password);
		loginPg.loginSubmit(driver);
		Thread.sleep(3000);
		String sourceCode = driver.getPageSource();
		if (sourceCode.contains("Invalid Credentials")) {
			System.out.println("Invalid Credentials");
		} else {
			System.out.println("valid Credentials");

		}
	}


//	Attempt login with blank fields and verify UI behavior 
	@Test
	public void testWithoutValidCred() throws InterruptedException {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		loginPg.loginSubmit(driver);
		Thread.sleep(3000);
		String sourceCode = driver.getPageSource();
		if (sourceCode.contains("Invalid Credentials")) {
			System.out.println("without Credentials");
		} else {
			System.out.println("valid Credentials");

		}
	}

//	Validate presence of page elements (e.g., title, input fields, eye icon)
	@Test
	public void testUIElements() throws InterruptedException {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		if (loginPg.getLoginPassword().isDisplayed() && loginPg.getPasswordLabel().isDisplayed()) {

			System.out.println("Password text field with lable is present");
		}
		if (loginPg.getLoginUserId().isDisplayed() && loginPg.getUserIdLabel().isDisplayed()) {

			System.out.println("UserId text field with lable is present");
		}
		if (loginPg.getLoginPasswordEyeIcon().isDisplayed()) {

			System.out.println("Eye icon in password file is present");
		}
		if (loginPg.getMainTitle().isDisplayed()) {

			System.out.println("Main title is present");
		}
		if (loginPg.getSubTitle().isDisplayed()) {

			System.out.println("Sub title is present");
		}
		if (loginPg.getBottomTitle().isDisplayed()) {
			System.out.println("Bottom title is present");

		}
		if (loginPg.getLoginButton().isDisplayed()) {
			System.out.println("Login button is present");

		}
		if (loginPg.getLogoTrack().isDisplayed()) {

			System.out.println("Logo track is present");
		}
		if (loginPg.getTopLeftLogo().isDisplayed()) {

			System.out.println("Left logo is present");
		}
		if (loginPg.getTopRightLogo().isDisplayed()) {

			System.out.println("Right logo is present");
		}

		Thread.sleep(3000);
		String sourceCode = driver.getPageSource();
		if (sourceCode.contains("Invalid Credentials")) {
			System.out.println("Invalid Credentials");
		} else {
			System.out.println("valid Credentials");

		}
	}

}
