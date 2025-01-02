package com.elementRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "bus_tickets_vertical")
	private WebElement busTicketButton;

	public WebElement getBusTicketButton() {
		return busTicketButton;
	}
	public void switchToTabOnTitle(WebDriver driver ,String partialTitle) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(partialTitle)) {
				break;
			}
		}
	}
	public void clickMethod(WebElement element) {
		element.click();
	}
	public BusTicketHomePage clickOnBusTicket(WebDriver driver) {
		clickMethod(getBusTicketButton());
		return new BusTicketHomePage(driver);
	}
}
