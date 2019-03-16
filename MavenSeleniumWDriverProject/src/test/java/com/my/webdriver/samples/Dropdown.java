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
public class Dropdown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		Thread.sleep(1000);
		
		WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
		dropdownMenu.click();
		Thread.sleep(1000);
		
		WebElement autocompleteOption = driver.findElement(By.id("autocomplete"));
		autocompleteOption.click();
		Thread.sleep(1000);
		
				
		driver.quit();
		
	}

}
