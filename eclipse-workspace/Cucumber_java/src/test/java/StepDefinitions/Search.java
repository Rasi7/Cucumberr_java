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

public class Search {
	public WebDriver driver;
	public String searchItem;
	
	@Given("Welcome page is diaplyed")
	public void welcome_page_is_diaplyed() {
		ChromeOptions opt= new ChromeOptions();
		opt.setBinary("C:\\Users\\saira\\OneDrive\\ドキュメント\\SELINUM_CAP\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user enters {string} in search text field")
	public void user_enters_in_search_text_field(String searchItem) {
		
		this.searchItem=searchItem;
	    driver.findElement(By.id("small-searchterms")).sendKeys(searchItem);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Then("Search results result must be diaplyed")
	public void search_results_result_must_be_diaplyed() {
	   Assert.assertTrue(driver.findElement(By.id("Q")).getAttribute("value").contains(searchItem));
	}



}
