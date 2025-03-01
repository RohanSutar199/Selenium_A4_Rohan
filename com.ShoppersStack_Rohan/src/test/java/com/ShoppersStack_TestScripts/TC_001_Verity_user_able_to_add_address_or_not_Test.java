package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.AddressForm_Page;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_001_Verity_user_able_to_add_address_or_not_Test extends Base_Test{
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		myAddressesPage.getAddAddressBtn().click();
		
		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		addressFormPage.getOfficeRB().click();
		
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,0));
		addressFormPage.getHouseTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,1));
		addressFormPage.getStreetInfoTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,2));
		addressFormPage.getLandmarkTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,3));
		
		webdriverDriverUtility.selectByValue(addressFormPage.getCountryDropDown(), fileUtility.readDataFromPropertyFile("country"));
		webdriverDriverUtility.selectByValue(addressFormPage.getStateDropDown(), fileUtility.readDataFromPropertyFile("state"));
		webdriverDriverUtility.selectByValue(addressFormPage.getCityDropDown(), fileUtility.readDataFromPropertyFile("city"));
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,5));
		addressFormPage.getAddAddressBtn().click();
		
		Thread.sleep(2000);
		myAddressesPage.getCloseBtn().click();
		
		webdriverDriverUtility.getWebPageScreenshot(driver);		
		
	}

}
