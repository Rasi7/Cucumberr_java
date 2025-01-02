package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserAgreementPage  extends TermsAndConditionsPage{

	public UserAgreementPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//h3[text()='USER AGREEMENT']")
	private WebElement userTitle;

	public WebElement getUserTitle() {
		return userTitle;
	}
}
