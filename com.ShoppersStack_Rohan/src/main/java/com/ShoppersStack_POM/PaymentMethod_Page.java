package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod_Page {
	
	public PaymentMethod_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//input[@value='COD']")
	private WebElement codRadioBtn;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getCodRadioBtn() {
		return codRadioBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}	

}
