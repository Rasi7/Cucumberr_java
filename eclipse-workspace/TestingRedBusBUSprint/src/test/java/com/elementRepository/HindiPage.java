package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HindiPage  extends BusTicketHomePage{

	public HindiPage(WebDriver driver) {
	super(driver);
	}
	@FindBy(xpath="//h1[text()='भारत की नंबर 1 ऑनलाइन बस टिकट बुकिंग साइट']")
	private WebElement hindiTitle;
	
	
	public WebElement getHindiTitle() {
		return hindiTitle;
	}
}
