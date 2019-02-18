/**
 * 
 */
package com.my.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * @author renat
 *
 */
public class AutoComplete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.click();
		autocomplete.sendKeys("123 Bonita Street");
		
		WebElement button = driver.findElement(By.id("button"));
		
		button.click();
		
		
		driver.quit();
		
	}

}
