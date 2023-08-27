package adactin.com;

import java.io.File;


import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;

public class AdactinHotel {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\ABCD\\Downloads\\chrome-win64\\chrome.exe");

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\ABCD\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		// page1

		driver.findElement(By.id("username")).sendKeys("Joshva45");

		driver.findElement(By.id("password")).sendKeys("R5543G");

		driver.findElement(By.id("login")).click();

		// page2

		Select drop = new Select(driver.findElement(By.id("location")));

		drop.selectByIndex(4);

		Select drop2 = new Select(driver.findElement(By.id("room_nos")));

		drop2.selectByIndex(1);

		driver.findElement(By.id("datepick_in")).sendKeys("01/01/2023");

		driver.findElement(By.id("datepick_out")).sendKeys("05/01.2023");

		Select drop3 = new Select(driver.findElement(By.id("adult_room")));

		drop3.selectByIndex(1);

		driver.findElement(By.id("Submit")).click();

		// page3

		driver.findElement(By.id("radiobutton_3")).click();

		driver.findElement(By.id("continue")).click();

		// page4

		driver.findElement(By.id("first_name")).sendKeys("Joshva");

		driver.findElement(By.id("last_name")).sendKeys("Jose");

		driver.findElement(By.id("address")).sendKeys("14/24,GBSK Building MH Road,Melemaruvathur");

		driver.findElement(By.id("cc_num")).sendKeys("7890123478901234");

		Select drop4 = new Select(driver.findElement(By.id("cc_type")));

		drop4.selectByIndex(1);

		Select drop5 = new Select(driver.findElement(By.id("cc_exp_month")));

		drop5.selectByIndex(2);

		Select drop6 = new Select(driver.findElement(By.id("cc_exp_year")));

		drop6.selectByIndex(12);

		driver.findElement(By.id("cc_cvv")).sendKeys("4563");

		driver.findElement(By.id("book_now")).click();

		// page5

		driver.findElement(By.id("book_now")).click();

		// page6

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,500)");

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("Image folder//Jose.png");

		FileUtils.copyFile(src, des);

		driver.quit();

	}

}
