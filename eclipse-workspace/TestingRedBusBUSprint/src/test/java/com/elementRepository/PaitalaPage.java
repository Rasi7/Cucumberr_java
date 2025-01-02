package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaitalaPage extends PEPSUPage {
public PaitalaPage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//h2[text()=' Search Patiala Bus Tickets ']")
private  WebElement paitalaTitle;

public WebElement getPaitalaTitle() {
	return paitalaTitle;
}


}
