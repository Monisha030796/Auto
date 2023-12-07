package org.junitpractice;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement button;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	public WebElement getButton() {
		return button;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
} 	


