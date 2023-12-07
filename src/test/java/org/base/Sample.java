package org.base;

import java.io.IOException;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	static WebElement userName;
	static WebElement password;
	static WebElement login;
	static WebElement cancel;
	@BeforeClass
	public static void be() {
		browserLaunch("chrome");
		maximise();
		loadUrl("https://www.facebook.com/");
		LoginPage loginPage=new LoginPage();
		userName=loginPage.getUserName();
		password=loginPage.getPassword();
		login=loginPage.getLogin();
		cancel=loginPage.getCancel();
	}
	
@Test
public void c() throws Exception {
	for (int i = 0; i < 9; i++) {
		
	
	String name=excelRead("src\\test\\resources\\Book1.xlsx", "Sheet4", i, 0);
	String pass=excelRead("src\\test\\resources\\Book1.xlsx", "Sheet4", i, 1);
	
	passValue(userName, name);
    passValue(password, pass);
	elementClick(login);
	Thread.sleep(3000);
	//elementClick(cancel);
	back();
	refreshPage();
	}
}
@After
public void u() {
	
// refreshPage();
  
}
@AfterClass
public static void w() {
	quitBrowser();
}
}
