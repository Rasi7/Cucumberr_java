package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQPage  extends BusTicketHomePage{
    public FAQPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[text()='TICKET-RELATED']")
	private WebElement tickedRelated;

	public WebElement getTickedRelated() {
		return tickedRelated;
	}

	@FindBy(xpath = "//span[text()='CANCELLATION-RELATED']")
	private WebElement cancellationRelated;

	public WebElement getCancellationRelated() {
		return cancellationRelated;
	}

	@FindBy(xpath = "//span[text()='REFUND-RELATED']")
	private WebElement refundRelated;

	public WebElement getRefundRelated() {
		return refundRelated;
	}

	@FindBy(xpath = "//h3[text()=' Frequently Asked Questions '] ")
	private WebElement faqTitle;

	public WebElement getFaqTitle() {
		return faqTitle;
	}

	@FindBy(xpath = "//h3[text()='TERMS OF SERVICE']")
	private WebElement privacyTitle;

	public WebElement getPrivacyTitle() {
		return privacyTitle;
	}

	

	@FindBy(xpath = "//title[text()='Frequently Asked Question(FAQ) | redBus']")
	private WebElement faqTab;

	public WebElement getFaqTab() {
		return faqTab;
	}

	@FindBy(xpath = "//title[text()='RedBus - Terms and Conditions | Online Bus Ticket Booking Policies']")
	private WebElement termTab;

	public WebElement getTermTab() {
		return termTab;
	}

	@FindBy(xpath = "//title[text()='User Agreement | redBus']")
	private WebElement userTab;

	public WebElement getUserTab() {
		return userTab;
	}
	
	@FindBy(id = "terms_n_conditions_footer")
	private WebElement tAndcLink;

	public WebElement gettAndcLink() {
		return tAndcLink;
	}
	
	public TermsAndConditionsPage clickOnTermsAndConditions( WebDriver driver) {
		clickMethod(gettAndcLink());
		return new TermsAndConditionsPage(driver);
	}
}
