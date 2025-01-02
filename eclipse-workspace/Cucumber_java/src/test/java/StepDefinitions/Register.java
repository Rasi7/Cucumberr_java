package StepDefinitions;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
WebDriver driver;
	@Given("Browser is open")
	public void browser_is_open() {
		ChromeOptions opt= new ChromeOptions();
		opt.setBinary("C:\\Users\\saira\\OneDrive\\ドキュメント\\SELINUM_CAP\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() {
	    driver.findElement(By.linkText("Register")).click();
	}

	@When("user enter valid credantials")
	public void user_enter_valid_credantials() {
	   driver.findElement(By.id("gender-female")).click();
	   driver.findElement(By.id("FirstName")).sendKeys("rasi@1234");
	   driver.findElement(By.id("LastName")).sendKeys("kota");
	   Random r=new Random();
	   String email ="rasi"+r.nextInt(500)+"@gmail.com";
	   driver.findElement(By.id("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).sendKeys("rasi@4322");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("rasi@4322");
	   
	}

	@When("clicks on register button")
	public void clicks_on_register_button() {
	    driver.findElement(By.id("register-button")).click();
	}

	@Then("a new account should be created")
	public void a_new_account_should_be_created() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']")).isDisplayed());
	}

	@Then("brower must be closed")
	public void brower_must_be_closed() {
	    driver.close();
	}
	
	


}
