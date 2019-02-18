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
public class SwitchToActiveWindow {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
		String originalHandle = driver.getWindowHandle();
		
		for (String handle1: driver.getWindowHandles()){
			driver.switchTo().window(handle1);
		}
		
		driver.switchTo().window(originalHandle);
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}