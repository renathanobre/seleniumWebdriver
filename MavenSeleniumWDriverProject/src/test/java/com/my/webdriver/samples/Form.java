/**
 * 
 */
package com.my.webdriver.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.Assert.assertEquals;

/**
 * @author renat
 *
 */
public class Form {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Renata\\projetos\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/form");

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitFormAlertBanner(driver);

		assertEquals("The form was successfully submitted!"
				, confirmationPage.getAlertBannerText(driver));

		driver.quit();

	}



}
