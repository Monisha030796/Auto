package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {

	public FbLoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPassword;
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createnewAccount;
	
	public WebElement getUserName() {
		
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getCreateNewAccount() {
		return createnewAccount ;
	}
}
