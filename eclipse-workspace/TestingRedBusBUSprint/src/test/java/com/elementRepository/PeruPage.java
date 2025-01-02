package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PeruPage extends ColombiaPage{
	
	public PeruPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="more")
	private WebElement peruReadMore;
	
	public WebElement getPeruReadMore() {
		return peruReadMore;
	}
	
	 @FindBy(xpath="//div[text()='Singapore']")
	private WebElement singapore;
	
	public WebElement getSingapore() {
		return singapore;
	}
	@FindBy(xpath="//title[text()='Book bus tickets of the best bus companies in Peru | redBus']")
	private WebElement peruTab;
	
	
	public WebElement getPeruTab() {
		return peruTab;
	}
	
	public SingaporePage clickOnSingaporePage(WebDriver driver) {
		clickMethod(getSingapore());
		return new SingaporePage(driver);
	}
}
