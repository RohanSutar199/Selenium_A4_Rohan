package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "buynow_fl")
	private WebElement buyNowBtn;
	
	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCartBtn;
	
	@FindBy(xpath = "//*[name()='svg' and @id='decrease']")
	private WebElement decreaseQtyBtn;
	
	@FindBy(xpath = "//*[name()='svg' and @id='increase']")
	private WebElement increaseQtyBtn;
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueShoppingBtn;

	public WebElement getBuyNowBtn() {
		return buyNowBtn;
	}

	public WebElement getRemoveFromCartBtn() {
		return removeFromCartBtn;
	}

	public WebElement getDecreaseQtyBtn() {
		return decreaseQtyBtn;
	}

	public WebElement getIncreaseQtyBtn() {
		return increaseQtyBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}	
	
}
