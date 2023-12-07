package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount extends BaseClass{
	public NewAccount() {
PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getSex() {
		return sex;
	}
	public WebElement getSignup() {
		return signup;
	}
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mail;
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement pass;
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;
	@FindBy (xpath = "//select[@id='month']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='year']")
    private WebElement year;
	@FindBy(xpath = "(//input[@name='sex'])[1]")
	private WebElement sex;
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement signup;
	
}
