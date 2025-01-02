package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingaporePage extends PeruPage {
public SingaporePage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//div[text()='World’s No.1 Bus Ticket Booking Site']")
private WebElement singaporeTitle;

public WebElement getSingaporeTitle() {
	return singaporeTitle;
}

}
