package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelOrder_Page {
	
	public CancelOrder_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Cancel Order']")
	private WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getCancelOrderBtn() {
		return cancelOrderBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	

}
