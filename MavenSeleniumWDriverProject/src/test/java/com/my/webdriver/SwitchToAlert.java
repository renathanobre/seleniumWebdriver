/**
 * 
 */
package com.my.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * @author renat
 *
 */
public class SwitchToAlert {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
