/**
 * 
 */
package com.my.webdriver.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

/**
 * @author renat
 *
 */
public class DragAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args){


		System.setProperty("webdriver.chrome.driver",
				"C:\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dragdrop");

/**
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement image = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("image")));

		WebElement box = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("box")));
 */

		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(image,box).build().perform();

		//Thread.sleep(1000);
		//driver.quit();

	}

}
