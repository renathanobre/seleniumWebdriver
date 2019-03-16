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
public class LocatorIdentifierFB {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://facebook.com");
		Thread.sleep(500);
		
		driver.findElement(By.id("email")).sendKeys("this is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		
		driver.findElement(By.id("email")).clear();
		//Multiple values- Selenium indentifies the first one - scans from top left
		driver.findElement(By.className("inputtext")).sendKeys("same class name test");
		
		
		/**
		 * every object may not have ID, className or name - XPath and CSS Preferred
		 * Alpha numeric id may vary on every refresh - check it
		 */
		driver.findElement(By.cssSelector(("#u_0_2"))).click();;
		driver.navigate().back();
		//confirm the link object with anchor "a" tag so use linkText
		driver.findElement(By.linkText(("Forgot account?"))).click();
		driver.findElement(By.className("uiButtonText")).click();

		driver.close(); //it closes current browsers
		//driver.quit(); //it closes all the browsers opened by selenium script

	}

}
