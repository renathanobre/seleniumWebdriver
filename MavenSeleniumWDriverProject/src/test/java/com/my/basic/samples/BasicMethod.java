/**
 * 
 */
package com.my.basic.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author renat
 *
 */
public class BasicMethod {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver",
				"C:\\Renata\\projetos\\app\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://google.com");

		Thread.sleep(1000);

		driver.getTitle(); //hit url on the browser
		System.out.println(driver.getTitle()); //validate if your  Page title is correct

		System.out.println(driver.getCurrentUrl()); //validate you are landed on correct url

		System.out.println(driver.getPageSource()); //print source page

		driver.get("http://yahoo.com");

		driver.navigate().back();

		driver.close(); //it closes current browsers
		//driver.quit(); //it closes all the browsers opened by selenium script



	}

}
