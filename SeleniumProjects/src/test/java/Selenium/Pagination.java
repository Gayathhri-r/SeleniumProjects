package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {

		// no set up property is used instead, WebDriverManager is used
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();// no need to write WebDriver
																						// Driver = new ChromeDriver()
																						// -no need to set up
																						// chromedriver
		// Create - giving Webdriver instance and it automatically closes the webpage
		// avoid shut down hook does not close the webpage
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// login
		/*
		 * driver.findElement(By.id("username")).sendKeys("lms");
		 * driver.findElement(By.id("password")).sendKeys("lms");
		 * System.out.println(driver.getTitle()); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//app-header//button[4]")).click();
		 * Thread.sleep(2000);
		 */
//list of rows
		int rowCount = driver.findElements(By.xpath("//table/tbody//td[1]")).size();
		System.out.println(rowCount);

	}

}
