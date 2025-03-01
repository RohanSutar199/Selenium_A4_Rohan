package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.CancelOrder_Page;

public class TC_004_Verity_user_able_to_cancel_order_or_not extends Base_Test {
	
	@Test
	public void cancelOrder() throws IOException, InterruptedException {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyOrdersBtn().click();
		
		CancelOrder_Page cancelOrderPage = new CancelOrder_Page(driver);
		cancelOrderPage.getCancelOrderBtn().click();
		Thread.sleep(1000);
		cancelOrderPage.getYesBtn().click();
		Thread.sleep(2000);
		webdriverDriverUtility.getWebPageScreenshot(driver);
		Thread.sleep(5000);
		
	}

}
