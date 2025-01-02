package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TermsAndConditionsPage extends FAQPage {
	

	public TermsAndConditionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "user_agreement_footer")
	private WebElement userAgreement;

	public WebElement getUserAgreement() {
		return userAgreement;
	}
	
	public  UserAgreementPage clickOnUserAgreementPage(WebDriver driver) {
		clickMethod(getUserAgreement());
		return new UserAgreementPage(driver);
	}
}
