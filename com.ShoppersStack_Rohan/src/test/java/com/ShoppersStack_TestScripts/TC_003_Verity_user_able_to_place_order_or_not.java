package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.Cart_Page;
import com.ShoppersStack_POM.ConfirmAddress_Page;
import com.ShoppersStack_POM.PaymentMethod_Page;

public class TC_003_Verity_user_able_to_place_order_or_not extends Base_Test {
	
	@Test
	public void placeOrder() throws InterruptedException, IOException {
		
		webdriverDriverUtility.actionScrollToElement(driver, homePage.getAddToCartBtn());
		Thread.sleep(1000);
		homePage.getAddToCartBtn().click();
		Thread.sleep(2000);
		homePage.getCartIconBtn().click();
		Thread.sleep(2000);
		
		Cart_Page cartPage = new Cart_Page(driver);
		cartPage.getBuyNowBtn().click();
		Thread.sleep(1000);
		ConfirmAddress_Page confirmAddressPage = new ConfirmAddress_Page(driver);
		confirmAddressPage.getSelectAddressRadioBtn().click();
		Thread.sleep(1000);
		confirmAddressPage.getProceedBtn().click();
		Thread.sleep(1000);
		
		PaymentMethod_Page paymentMethodPage = new PaymentMethod_Page(driver);
		paymentMethodPage.getCodRadioBtn().click();
		Thread.sleep(1000);
		paymentMethodPage.getProceedBtn().click();
		
		Thread.sleep(2000);
		webdriverDriverUtility.getWebPageScreenshot(driver);
		Thread.sleep(5000);
		
	}

}
