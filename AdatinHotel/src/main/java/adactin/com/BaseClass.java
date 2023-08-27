package adactin.com;

import static adactin.com.Utills.*;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void browserLaunch() {
		System.setProperty(chrome, driverpath);
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static WebElement idLocator(String element) {
		return driver.findElement(By.id(element));
	}
	
}
