package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin {
	WebDriver driver;
	@Given("broswer will open and url navigated")
	public void broswer_will_open_and_url_navigated() {
		ChromeOptions opt= new ChromeOptions();
		opt.setBinary("C:\\Users\\saira\\OneDrive\\ドキュメント\\SELINUM_CAP\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.shoppersstack.com/");
	}

	@Given("Login page will be displayed")
	public void login_page_will_be_displayed() {
	    driver.findElement(By.id("loginBtn")).click();
	}

	@Given("Shoppers login will be displayed")
	public void shoppers_login_will_be_displayed() {
	    System.out.println("shoper login displayed");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String email, String password) {
	   driver.findElement(By.id("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[@id='Login']//span[@class='MuiButton-label']")).click();
	    
	}

	@Then("Shopper should be sucessfully logged in")
	public void shopper_should_be_sucessfully_logged_in() {
	    System.out.println("shopper sucessfully loged in");
	}

	@Then("Browser must be close")
	public void browser_must_be_close() {
	   driver.close();
	}




}
