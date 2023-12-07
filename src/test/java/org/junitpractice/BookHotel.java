package org.junitpractice;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
 public BookHotel() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//input[@id='first_name']")
 private WebElement firstName;
 @FindBy(xpath="//input[@id='last_name']")
 private WebElement lastName;
 @FindBy(xpath = "//textarea[@id='address']")
 private WebElement address;
 @FindBy(xpath = "//input[@id='cc_num']")
 private WebElement cardNum;
 @FindBy(xpath = "//select[@id='cc_type']")
 private WebElement cardType;
 @FindBy(xpath = "//select[@id='cc_exp_month']")
 private WebElement month;
 @FindBy(xpath = "//select[@id='cc_exp_year']")
 private WebElement year;
 @FindBy(xpath = "//input[@id='cc_cvv']")
 private WebElement cvv;
 @FindBy(xpath = "//input[@id='book_now']")
 private WebElement booknow;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardNum() {
	return cardNum;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
}
