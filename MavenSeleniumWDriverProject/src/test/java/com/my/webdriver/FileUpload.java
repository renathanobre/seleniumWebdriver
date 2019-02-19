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
public class FileUpload {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Renata\\projetos\\app\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		Thread.sleep(1000);
		
		WebElement uploadField= driver.findElement(By.id("file-upload-field"));
		uploadField.sendKeys("success.png");
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
