package StepDefinitions;

import java.time.Duration;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatableRegister {
	WebDriver driver;
	@Given("Broswer is open")
	public void broswer_is_open() {
		ChromeOptions opt= new ChromeOptions();
		opt.setBinary("C:\\Users\\saira\\OneDrive\\ドキュメント\\SELINUM_CAP\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		 
	}

	@When("user enters valid credentails")
	public void user_enters_valid_credentails(io.cucumber.datatable.DataTable dataTable) {
	  List<String> data = dataTable.asList();
	  driver.findElement(By.xpath("//input[@value='"+data.get(0)+"']")).click();
	  driver.findElement(By.id("FirstName")).sendKeys(data.get(1));
	  driver.findElement(By.id("LastName")).sendKeys(data.get(2));
	  driver.findElement(By.id("Email")).sendKeys(data.get(3));
	  driver.findElement(By.id("Password")).sendKeys(data.get(4));
	  driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(5));
	  
	  
	  
	  
	}

	@When("click on register button")
	public void click_on_register_button() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']")).isDisplayed());
	}

	@Then("a new Account should be created")
	public void a_new_account_should_be_created() {
	   driver.close();
	   
	}



}
