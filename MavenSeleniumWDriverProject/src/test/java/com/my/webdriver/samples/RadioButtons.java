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
public class RadioButtons {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		Thread.sleep(1000);
		
		WebElement radioButtonOne = driver.findElement(By.id("radio-button-1"));
		radioButtonOne.click();
		
		Thread.sleep(1000);
		
		WebElement radioButtonTwo = driver.findElement(By.cssSelector("input[value='option2']"));
		radioButtonTwo.click();
		
		Thread.sleep(1000);
		
		WebElement radioButtonThree = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radioButtonThree.click();
		
		driver.quit();
		
	}

}
