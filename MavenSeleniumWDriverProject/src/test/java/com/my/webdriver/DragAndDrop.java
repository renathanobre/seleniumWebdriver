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
public class DragAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Renata\\projetos\\app\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dragdrop");


		WebElement image = driver.findElement(By.id("image"));

		WebElement box = driver.findElement(By.id("box"));


		Actions actions = new Actions(driver);

		actions.doubleClick(image);

		Thread.sleep(2000);

		actions.contextClick(box);

		Thread.sleep(2000);

		actions.dragAndDrop(image, box).perform();
		actions.build();

		//Thread.sleep(1000);
		//driver.quit();

	}

}
