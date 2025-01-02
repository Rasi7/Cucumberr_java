package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ColombiaPage  extends BusTicketHomePage{

	public ColombiaPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//h1[text()='redBus la forma más fácil de comprar pasajes de bus']")
	private WebElement colombiaTitle;

	public WebElement getColombiaTitle() {
		return colombiaTitle;
	}

	@FindBy(xpath = "(//div[@class='rb_main_secondary_item  link']//i[@class='icon icon-down icon_secondary_item_more'])[1]")
	private WebElement colombiaDropDown;

	public WebElement getColombiaDropDown() {
		return colombiaDropDown;
	}

	@FindBy(id = "en")
	private WebElement colombiaEnglishDropDown;

	public WebElement getColombiaEnglishDropDown() {
		return colombiaEnglishDropDown;
	}

	@FindBy(xpath = " //span[text()=' ¿Necesito registrarme para usar redBus?  ']  ")
	private WebElement mainBusRouteLink;

	public WebElement getMainBusRouteLink() {
		return mainBusRouteLink;
	}
	@FindBy(xpath = "//p[contains(text(),'No, redBus no le pide a sus clientes que pasen por un proceso de registro.')]")
	private WebElement topBusTitle;

	public WebElement getTopBusTitle() {
		return topBusTitle;
	}
	@FindBy(xpath="//div[text()='Peru']")
    private WebElement peruLink;

	public WebElement getPeruLink() {
		return peruLink;
	}
	public PeruPage clickOnPeruPage(WebDriver driver) {
		clickMethod(getPeruLink());
		return new PeruPage(driver);
		
	}
}
