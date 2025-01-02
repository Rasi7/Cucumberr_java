package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GovernmentBusPage  extends BusTicketHomePage{

	public GovernmentBusPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='/online-booking/pepsu']")
	private WebElement pepsuLink;

	public void pepsu() {
		pepsuLink.click();
	}

	public WebElement getPepsuLink() {
		return pepsuLink;
	}

	@FindBy(xpath = "//h1[@class='D112_index_heading']")
	private WebElement rtcTitle;

	public WebElement getRtcTitle() {
		return rtcTitle;
	}

	@FindBy(xpath = "//h2[@class='D120_subheading']")
	private WebElement pepsPageText;

	public WebElement getPepsPageText() {
		return pepsPageText;
	}

	@FindBy(xpath = "//a[@href='/profile/cMrJPNmoVBtkIQb8e34HrYFybBxUawolbUTXUEBzMrg%3D?username=Amar Parshad']")
	private WebElement customerReviewTextFeild;

	public WebElement getCustomerReviewTextFeild() {
		return customerReviewTextFeild;
	}

	@FindBy(xpath = "//div[@class='DC_206_hd']")
	private WebElement profileText;

	public WebElement getProfileText() {
		return profileText;
	}

	@FindBy(xpath = "(//a[text()='Patiala'])[1]")
	private WebElement headOfficeLink;

	public WebElement getHeadOfficeLink() {
		return headOfficeLink;
	}

	@FindBy(xpath = "//h1[text()=' Patiala Bus '] ")
	private WebElement punjabHeading;

	public WebElement getPunjabHeading() {
		return punjabHeading;
	}

	@FindBy(xpath = "//title[text()='List of RTC Operators in India, Bus Directory, Top Bus Routes - redbus.in']")
	private WebElement busTab;

	public WebElement getBusTab() {
		return busTab;
	}
	
	public PEPSUPage clickOnPEPSU(WebDriver driver) {
		clickMethod(pepsuLink);
		return new PEPSUPage(driver);
	}
	
}
