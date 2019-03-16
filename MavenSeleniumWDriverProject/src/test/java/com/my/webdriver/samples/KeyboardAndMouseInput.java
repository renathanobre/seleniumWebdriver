/**
 * 
 */
package com.my.webdriver.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * @author renat
 *
 */
public class KeyboardAndMouseInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Renata Vieira");
		
		WebElement button = driver.findElement(By.id("button"));
		
		button.click();
		
		
		driver.quit();
		
	}

}
