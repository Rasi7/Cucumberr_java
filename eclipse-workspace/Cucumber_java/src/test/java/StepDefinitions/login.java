package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver  driver;
	@Given("Browser is open and url is navigated")
	public void browser_is_open_and_url_is_navigated() {
		ChromeOptions opt= new ChromeOptions();
		opt.setBinary("C:\\Users\\saira\\OneDrive\\ドキュメント\\SELINUM_CAP\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    driver.findElement(By.className("ico-login")).click();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		 driver.findElement(By.id("Email")).sendKeys("rasi@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("12345678");
		 
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("User should be sucessfully logged in")
	public void user_should_be_sucessfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
	}

	@Then("Broswe should close")
	public void broswe_should_close() {
	    driver.close();
	}



	
}
