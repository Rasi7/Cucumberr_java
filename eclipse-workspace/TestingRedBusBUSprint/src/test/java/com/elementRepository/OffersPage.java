package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OffersPage extends BusTicketHomePage{

	public OffersPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//span[@class='OfferPro'])[1]")
	private WebElement firstOfferLink;

	public WebElement getFirstOfferLink() {
		return firstOfferLink;
	}

	@FindBy(xpath = "//td[@data-promo='CASH300']")
	private WebElement secondOfferLink;

	public WebElement getSecondOfferLink() {
		return secondOfferLink;
	}

	@FindBy(id = "offerClose")
	private WebElement OffersClose;

	public WebElement getOffersClose() {
		return OffersClose;
	}

	@FindBy(xpath = "//h1[@class='XCN']")
	private WebElement OfferTitle;

	public WebElement getOfferTab() {
		return offerTab;
	}

	@FindBy(xpath = "//title[text()='Offers: Bus Offers & Coupon Codes | Grab Discount on Bus Booking']")
	private WebElement offerTab;

	public WebElement getOfferTitle() {
		return OfferTitle;
	}
	
	
}
