package com.stepDefinitions;
import java.time.Duration;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import com.elementRepository.BasePage;
import com.elementRepository.BusTicketHomePage;
import com.elementRepository.ColombiaPage;
import com.elementRepository.FAQPage;
import com.elementRepository.GovernmentBusPage;
import com.elementRepository.HindiPage;
import com.elementRepository.OffersPage;
import com.elementRepository.PEPSUPage;
import com.elementRepository.PaitalaPage;
import com.elementRepository.PeruPage;
import com.elementRepository.SingaporePage;
import com.elementRepository.TamilPage;
import com.elementRepository.TermsAndConditionsPage;
import com.elementRepository.UserAgreementPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BusTickets {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility fileUtility = new FileUtility();
    Actions actions=new Actions(driver);
	BasePage basePage=new BasePage(driver);
	BusTicketHomePage busTicketHomePage;
	OffersPage offersPage;
	GovernmentBusPage governmentBusPage;
	FAQPage faqPage;
	HindiPage hindiPage;
	TamilPage tamilPage;
	PEPSUPage pepsuPage;
	PaitalaPage paitalaPage;
	ColombiaPage colombiaPage;
	UserAgreementPage userAgreementPage;
	TermsAndConditionsPage termsAndConditionsPage;
	PeruPage peruPage;
	SingaporePage singaporePage;

	@Given("Browser will be lunched and url should be navigated")
	public void browser_will_be_lunched_and_url_should_be_navigated() throws Exception {
		String actualurl = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
		Reporter.log("navigated to the redbus", true);
	}

	@Given("user click on bus ticket button")
	public void user_click_on_bus_ticket_button() {
		
		busTicketHomePage=basePage.clickOnBusTicket(driver);
		Reporter.log("bus ticket page navigated", false);
	}

	@When("user is able to click on  {int} in the language dropdown")
	public void user_is_able_to_click_on_in_the_language_dropdown(Integer int1) throws Exception {
		busTicketHomePage.clickMethod(busTicketHomePage.getLanguageDropDown());
		String data = fileUtility.getDataFromExcel("LanguageData", int1, 0);
		switch (data) {
		case "English":
              busTicketHomePage.clickMethod(busTicketHomePage.getEnglishLink());
              Assert.assertTrue(busTicketHomePage.getHomeTitle().isDisplayed());
			break;
		case "हिंदी (Hindi)":

			hindiPage = busTicketHomePage.clickOnHindi(driver);
			Assert.assertTrue(hindiPage.getHindiTitle().isDisplayed());
			break;
		case "தமிழ் (Tamil)":

			tamilPage = busTicketHomePage.clickOnTamil(driver);
			Assert.assertTrue(tamilPage.getTamiliTitle().isDisplayed());

			break;
		}
		Reporter.log(" Sucessfully languages changed ", true);
	}

	@Then("user should able to see the information in relavent language")
	public void user_should_able_to_see_the_information_in_relavent_language() {
		Assert.assertTrue(busTicketHomePage.getHomeTitle().isDisplayed());
		Reporter.log("user sucessfully navigated to home page ", true);
	}


	@When("user should  click on ViewAll link")
	public void user_should_click_on_view_all_link() {
        offersPage = busTicketHomePage.clickOnOffers(driver);
		Reporter.log("user navigate to offer", true);
	}

	@When("user should navigate to Offer page")
	public void user_should_navigate_to_offer_page() throws InterruptedException {
		offersPage.switchToTabOnTitle(driver, offersPage.getOfferTab().toString());
		offersPage.clickMethod(offersPage.getFirstOfferLink());
		Reporter.log("user navigates to bus offer", true);
	}

	@Then("user should get bus Offers")
	public void user_should_get_bus_offers() throws InterruptedException {
        Assert.assertTrue(offersPage.getOfferTitle().isDisplayed());
		Reporter.log("user navigates to bus offer", true);
	}

	@Then("user should come back from bus offers")
	public void user_should_come_back_from_bus_offers() throws InterruptedException {
		   offersPage.clickMethod(offersPage.getOffersClose());
		   Thread.sleep(2000);
		   Assert.assertTrue(offersPage.getOfferTitle().isDisplayed());
           Reporter.log("user sucessfully came back to offers page", true);
	}

	@When("user  click on government buses viewAll")
	public void user_click_on_government_buses_view_all() {
        governmentBusPage = busTicketHomePage.clickOnGovernmentBuses(driver);
	    Reporter.log("sucessfully clicked on viewAll");
	}

	@When("user should navigate to the find all the RTC Operator directories page")
	public void user_should_navigate_to_the_find_all_the_rtc_operator_directories_page() throws InterruptedException {
		
		governmentBusPage.switchToTabOnTitle(driver, governmentBusPage.getRtcTitle().toString());
		Assert.assertTrue(governmentBusPage.getRtcTitle().isDisplayed());
		Reporter.log("Sucessfully navigated to the all the RTC Operator directories page", true);
	}

	@When("user  able to click on north zone PEPSU bus link")
	public void user_able_to_click_on_north_zone_pepsu_bus_link() throws InterruptedException {
        pepsuPage = governmentBusPage.clickOnPEPSU(driver);
        Reporter.log("Sucessfully clicked on PEPSU link ", true);
	}

	@Then("user should able to navigate to that paticular page")
	public void user_should_able_to_navigate_to_that_paticular_page() {
		Assert.assertTrue(governmentBusPage.getPepsPageText().isDisplayed());
		Reporter.log("Sucessfully navigated to PEPSU Page", true);
	}

	@Then("user click on head office of punjab")
	public void user_click_on_head_office_of_punjab() {
		actions.scrollToElement( pepsuPage.getHeadOfficeLink());

      try {
		    paitalaPage = pepsuPage.clickOnPaitalaPage(driver);
		} catch (ElementNotInteractableException e) {
		    WebElement headOfficeLink = pepsuPage.getHeadOfficeLink(); 
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headOfficeLink);
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    headOfficeLink = wait.until(ExpectedConditions.elementToBeClickable(headOfficeLink));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", headOfficeLink);
             paitalaPage = pepsuPage.clickOnPaitalaPage(driver);
		}
		Reporter.log("sucessfully clicked ", true);

	}

	@Then("user should navigate")
	public void user_should_navigate() {
        Assert.assertTrue(paitalaPage.getPaitalaTitle().isDisplayed());
		Reporter.log("Sucessfully navigated", true);
	}

	@When("user  click on FAQ")
	public void user_click_on_faq() {
	    actions.scrollToElement(busTicketHomePage.getFaqLink());
		faqPage = busTicketHomePage.clickOnFAQ(driver);
		Reporter.log("sucessfuly clicked on frequent asked questions", true);
	}

	@When("user should navigate to the frequent asked Questions")
	public void user_should_navigate_to_the_frequent_asked_questions() {
		faqPage.switchToTabOnTitle(driver, faqPage.getFaqTab().toString());
		Assert.assertTrue(faqPage.getFaqTitle().isDisplayed());
		Reporter.log("Sucessfully navigated to the page", true);
	}

	@When("user click on ticket related")
	public void user_click_on_ticket_related() {
        faqPage.clickMethod(faqPage.getTickedRelated());
		Reporter.log("Sucessfully clicked on ticket related link", true);
	}

	@When("user click on  refund related")
	public void user_click_on_refund_related() {
        faqPage.clickMethod(faqPage.getRefundRelated());
		Reporter.log("Sucessfully clicked on Refund Relatedlink", true);
	}

	@When("user click on cancellation related")
	public void user_click_on_cancellation_related() {
        faqPage.clickMethod(faqPage.getCancellationRelated());
		Reporter.log("Sucessfully clicked on Cancellation Related link", true);
	}

	@Then("user click on terms and conditions")
	public void user_click_on_terms_and_conditions() {
	
		actions.scrollToElement(faqPage.gettAndcLink());
        termsAndConditionsPage = faqPage.clickOnTermsAndConditions(driver);
		Reporter.log("sucessfuly clicked on terms and conditions", true);
	}

	@Then("user should navigate to the page")
	public void user_should_navigate_to_the_page() {
		termsAndConditionsPage.switchToTabOnTitle(driver, faqPage.getTermTab().toString());
		Assert.assertTrue(faqPage.getPrivacyTitle().isDisplayed());
		Reporter.log("sucessfuly navigated to terms and policy page", true);
	}

	@Then("user click on userAgrement")
	public void user_click_on_user_agrement() {
	
		actions.scrollToElement(termsAndConditionsPage.getUserAgreement());
        userAgreementPage = termsAndConditionsPage.clickOnUserAgreementPage(driver);
		Reporter.log("sucessfuly clicked on user agreement page", true);
	}

	@Then("user should navigate to the relavent page")
	public void user_should_navigate_to_the_relavent_page() {
		userAgreementPage.switchToTabOnTitle(driver, faqPage.getUserTab().toString());
		Assert.assertTrue(userAgreementPage.getUserTitle().isDisplayed());
		Reporter.log("sucessfuly navigated to user Agreement", true);
	}

	@When("user click on Colombia")
	public void user_click_on_colombia() throws InterruptedException {
		
		actions.scrollToElement(busTicketHomePage.getColombiaLink());
		colombiaPage = busTicketHomePage.clickOnColombia(driver);
		Reporter.log("Sucessfully clicked on Colombia", true);
	}

	@When("colombia page should be displayed")
	public void colombia_page_should_be_displayed() throws InterruptedException {
	//	Assert.assertTrue(colombiaPage.getColombiaTitle().isDisplayed());
		Reporter.log("Sucessfully navigated to colombia", true);
	}

	@When("user click on main bus route in colombia")
	public void user_click_on_main_bus_route_in_colombia() throws InterruptedException {
		
		actions.scrollToElement(colombiaPage.getMainBusRouteLink());
		colombiaPage.clickMethod(colombiaPage.getMainBusRouteLink());

	}

	@When("user should get the relavent information")
	public void user_should_get_the_relavent_information() {
		Assert.assertTrue(colombiaPage.getTopBusTitle().isDisplayed());
		Reporter.log("relavent information ", true);

	}
	@Given("user click on peru")
	public void user_click_on_peru() {
		
		 actions.scrollToElement(colombiaPage.getPeruLink());
	     peruPage=colombiaPage.clickOnPeruPage(driver);
	}

	@Given("user should navigate to the peru page")
	public void user_should_navigate_to_the_peru_page() {
		peruPage.switchToTabOnTitle(driver, peruPage.getPeruTab().toString());
	   Reporter.log("sucessfully navigated to the peru page", true);
	   
	}

	@Given("user click on Readmore in peru")
	public void user_click_on_readmore_in_peru() {
		
		actions.scrollToElement(peruPage.getPeruReadMore());
	    peruPage.clickMethod(peruPage.getPeruReadMore());
	    Reporter.log("sucessfully get relavent data", false);
	}

	@Then("user click on Singapore")
	public void user_click_on_singapore() {
	
		actions.scrollToElement(colombiaPage.getPeruLink());
		singaporePage=peruPage.clickOnSingaporePage(driver);
		Reporter.log("Sucessfully clicked on Singapore", true);
		
	}

	@Then("user should navigate to the singapore page")
	public void user_should_navigate_to_the_singapore_page() {
	    Assert.assertTrue(singaporePage.getSingaporeTitle().isDisplayed());
	    Reporter.log("Sucessfully navigated to SingaporePage", true);
	}



}
