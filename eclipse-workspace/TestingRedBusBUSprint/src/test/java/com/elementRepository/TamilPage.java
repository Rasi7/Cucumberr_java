package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TamilPage  extends BusTicketHomePage{

	public TamilPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//h1[text()='இந்தியாவின் நம்பர் 1 ஆன்லைன் பேருந்து டிக்கெட் முன்பதிவு தளம்']")
	private WebElement tamiliTitle;
	
	public WebElement getTamiliTitle() {
		return tamiliTitle;
	}
}
