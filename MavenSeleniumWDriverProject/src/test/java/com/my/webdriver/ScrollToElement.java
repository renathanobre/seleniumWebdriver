/**
 * 
 */
package com.my.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

/**
 * @author renat
 *
 */
public class ScrollToElement {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		WebElement name = driver.findElement(By.id("name"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(name);
		name.sendKeys("Renata Vieira");
		
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("02/02/2019");
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
