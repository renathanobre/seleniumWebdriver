/**
 * 
 */
package com.my.basic.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author renat
 *
 */
public class LocatorIdentifierSF {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://login.salesforce.com/");
		Thread.sleep(500);

		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		/**
		 * Compound class not accepted
		 * 
		 */
	//	driver.findElement(By.className(("button"))).click();;
		
		driver.close(); //it closes current browsers
		//driver.quit(); //it closes all the browsers opened by selenium script

	}

}
