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
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("123 Bonita Street, Palo Alto, CA");
		
		Thread.sleep(5000);
		
		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		autocompleteResult.click();
		
		
		
		driver.quit();
		
	}

}
