package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAddress_Page {
	
	public ConfirmAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Add New Address']")
	private WebElement addNewAddressBtn;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement selectAddressRadioBtn;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getAddNewAddressBtn() {
		return addNewAddressBtn;
	}

	public WebElement getSelectAddressRadioBtn() {
		return selectAddressRadioBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}
