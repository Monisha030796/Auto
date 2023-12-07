package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
 public class Testing extends BaseClass{
	 public static String name;
	 public static FbLoginPage fbloginpage;
	 public static NewAccount newaccount;
	 public static SoftAssert softAssert;
	@BeforeClass
	public void beforeClass() {
		browserLaunch("chrome");
		maximise();
		softAssert=new SoftAssert();
	}
	@AfterClass
	public void afterClass() {
		quit();
		softAssert.assertAll();
	}
	@BeforeMethod
	public void beforeMethod() {
		loadUrl("https://www.facebook.com/");
		fbloginpage=new FbLoginPage();
		}
	@AfterMethod
	public void afterMethod() throws IOException {
		screenShot();
	}
	@Test
	public void function() throws Exception {
		name="userLoginFunctionality";
		passValue(fbloginpage.getUserName(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 0));
		passValue(fbloginpage.getPassword(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 1));
		elementClick(fbloginpage.getLogin());
		softAssert.assertEquals(false, true);
	}
	@Test
	public void forgotPassword() {
		name="forgotPassword";
		elementClick(fbloginpage.getForgotPassword());
		softAssert.assertTrue(false);
	}
	@Test
	public void createNewAccount() throws IOException {
		name="createNewAccount";
		elementClick(fbloginpage.getCreateNewAccount());
	   newaccount=new NewAccount();
	   passValue(newaccount.getFirstName(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 2));
	   passValue(newaccount.getLastName(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 3));
	   passValue(newaccount.getMail(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 4));
	   passValue(newaccount.getPass(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 5));
	   passValue(newaccount.getDay(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 6));
	   passValue(newaccount.getMonth(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 7));
	   passValue(newaccount.getYear(), excelRead("src\\test\\resources\\Book1.xlsx", "Sheet5", 1, 8));
	   elementClick(newaccount.getSex());
	   elementClick(newaccount.getSignup());
	}
		

}
