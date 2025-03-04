package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_002_Verity_user_able_to_delete_address_or_not_Test extends Base_Test {

	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		Thread.sleep(2000);
		myAddressesPage.getDeleteAddress().click();
		Thread.sleep(1000);
		myAddressesPage.getYesBtn().click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		webdriverDriverUtility.getWebPageScreenshot(driver);
		Thread.sleep(5000);
		
	}
}
