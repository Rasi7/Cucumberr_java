package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PEPSUPage extends BusTicketHomePage {

	public PEPSUPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Patiala")
	private WebElement headOfficeLink;

	public WebElement getHeadOfficeLink() {
		return headOfficeLink;
	}
	
	public PaitalaPage clickOnPaitalaPage(WebDriver driver) {
		clickMethod(getHeadOfficeLink());
		return new PaitalaPage(driver);
	}
	
}
