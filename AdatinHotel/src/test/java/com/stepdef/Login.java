package com.stepdef;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	static WebDriver driver;

	@Given("enter username")
	public void enter_username() {
		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\ABCD\\Downloads\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABCD\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Joshva45");

	}

	@When("enter password")
	public void enter_password() {

		driver.findElement(By.id("password")).sendKeys("R5543G");
	}

	@Then("click login button")
	public void click_login_button() {

		driver.findElement(By.id("login")).click();

	}

}
