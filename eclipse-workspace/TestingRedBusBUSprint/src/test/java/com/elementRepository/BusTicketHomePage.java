package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusTicketHomePage  extends BasePage{
	
    public BusTicketHomePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath = "(//i[@class='icon icon-down icon_secondary_item_more'])[1]")
	private WebElement languageDropDown;

	public WebElement getLanguageDropDown() {
		return languageDropDown;
	}

	@FindBy(xpath = "(//span[text()='English'])[2]")
	private WebElement englishLink;

	public WebElement getEnglishLink() {
		return englishLink;
	}

	@FindBy(xpath = "//span[text()='हिंदी (Hindi)']")
	private WebElement hindiLink;

	public WebElement getHindiLink() {
		return hindiLink;
	}

	@FindBy(xpath = "//div[text()='India']")
	private WebElement indiaLink;

	public WebElement getIndiaLink() {
		return indiaLink;
	}

	@FindBy(xpath = "//div[text()='Peru']")
	private WebElement peruLink;

	public WebElement getPeruLink() {
		return peruLink;
	}

	@FindBy(xpath = "//div[text()='Singapore']")
	private WebElement sigaporeLink;

	public WebElement getSigaporeLink() {
		return sigaporeLink;
	}

	@FindBy(xpath = "//div[text()='Malaysia']")
	private WebElement MalaysiaLink;

	public WebElement getMalaysiaLink() {
		return MalaysiaLink;
	}

	@FindBy(xpath = "//div[text()='Indonesia']")
	private WebElement IndonesiaLink;

	public WebElement getIndonesiaLink() {
		return IndonesiaLink;
	}

	@FindBy(xpath = "//li[@data-text='தமிழ் (Tamil)']")
	private WebElement tamilLink;

	public WebElement getTamilLink() {
		return tamilLink;
	}

	@FindBy(xpath = "//*[@id='homeV2-root']/div[1]/h1")
	private WebElement homeTitle;

	public WebElement getHomeTitle() {
		return homeTitle;
	}
	
	
    @FindBy(xpath = "(//a[text()='View All'])[1]")
	private WebElement offerViewLink;

	public WebElement getOfferViewLink() {
		return offerViewLink;
	}

	@FindBy(xpath = "//a[@href='https://www.redbus.in/online-booking/rtc-directory']")
	private WebElement GovernmentBusesViewLink;

	public WebElement getGovernmentBusesViewLink() {
		return GovernmentBusesViewLink;
	}

	@FindBy(xpath = "//div[text()='Colombia']")
	private WebElement colombiaLink;

	public WebElement getColombiaLink() {
		return colombiaLink;
	}

	@FindBy(id = "terms_n_conditions_footer")
	private WebElement tAndcLink;

	public WebElement gettAndcLink() {
		return tAndcLink;
	}

	@FindBy(id = "privacy_policy_footer")
	private WebElement privacyPolicy;

	public WebElement getPrivacyPolicy() {
		return privacyPolicy;
	}

	@FindBy(id = "faq_footer")
	private WebElement faqLink;

	public WebElement getFaqLink() {
		return faqLink;
	}

	@FindBy(id = "user_agreement_footer")
	private WebElement userAgreement;

	public WebElement getUserAgreement() {
		return userAgreement;
	}


	public HindiPage clickOnHindi(WebDriver driver) {
		
		clickMethod(getHindiLink());
		return new HindiPage(driver);
	}
	public TamilPage clickOnTamil(WebDriver driver)
	{
	    clickMethod(getTamilLink());
	    return new TamilPage(driver);
		
	}
	
	public OffersPage clickOnOffers(WebDriver driver)
	{
		clickMethod(getOfferViewLink());
		return new OffersPage(driver);
		
	}
	public GovernmentBusPage clickOnGovernmentBuses(WebDriver driver)
	{
		clickMethod(getGovernmentBusesViewLink());
		return new GovernmentBusPage(driver);
	}
	public FAQPage clickOnFAQ(WebDriver driver) 
	{
		clickMethod(getFaqLink());
		return new FAQPage(driver);
	}
	public ColombiaPage clickOnColombia(WebDriver driver) {
		clickMethod(getColombiaLink());
		return new ColombiaPage(driver);
	}
	

}
