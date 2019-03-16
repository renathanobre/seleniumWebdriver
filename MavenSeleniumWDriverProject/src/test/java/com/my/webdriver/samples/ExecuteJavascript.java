/**
 * 
 */
package com.my.webdriver.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @author renat
 *
 */
public class ExecuteJavascript {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Renata\\projetos\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();

		Thread.sleep(1000);

		WebElement modalCloseButton = driver.findElement(By.id("close-button"));

		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", modalCloseButton);

		Thread.sleep(1000);
		driver.quit();

	}

}
