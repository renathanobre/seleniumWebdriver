/**
 * 
 */
package com.my.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * @author renat
 *
 */
public class DatePicker {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		Thread.sleep(1000);
		
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("02/02/2019");
		Thread.sleep(500);
		dateField.sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		
				
		driver.quit();
		
	}

}
