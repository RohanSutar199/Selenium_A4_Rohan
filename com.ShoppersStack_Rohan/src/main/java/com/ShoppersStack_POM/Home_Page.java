package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[contains(@class,'BaseBadge')])[2]")
	private WebElement accountSettingsBtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOutBtn;
	
	@FindBy(id = "addToCart")
	private WebElement addToCartBtn;
	
	@FindBy(id = "cartIcon")
	private WebElement cartIconBtn;
	
	@FindBy(xpath = "//li[text()='My Orders']")
	private WebElement myOrdersBtn;

	public WebElement getMyOrdersBtn() {
		return myOrdersBtn;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCartIconBtn() {
		return cartIconBtn;
	}

	public WebElement getAccountSettingsBtn() {
		return accountSettingsBtn;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
		
}
