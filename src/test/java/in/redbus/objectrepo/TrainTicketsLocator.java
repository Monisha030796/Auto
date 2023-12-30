package in.redbus.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.redbus.reusable.CommonAction;

public class TrainTicketsLocator extends CommonAction {
	public TrainTicketsLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Train Tickets']")
	public WebElement train;
	
	@FindBy(id="src")
	private WebElement from;
	@FindBy(xpath="//div[text()='Chennai - All Stations']")
	public WebElement location;
	
	@FindBy(id="dst")
	private WebElement to;
	
	@FindBy(xpath="(//div[text()='TEN'])[1]")
	public WebElement location1;
	
	
	@FindBy(xpath="//div[@class='home_date_wrap']")
	private WebElement calender ;
	
	@FindBy(xpath = "//span[text()='30']")
	private WebElement date;
	@FindBy(xpath="//button[text()='SEARCH TRAINS']")
	private WebElement search;


	public WebElement getLocation() {
		return location;
	}

	public WebElement getLocation1() {
		return location1;
	}

	public WebElement getDate() {
		return date;
	}


	public WebElement getTrain() {
		return train;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getSearch() {
		return search;
	}

}
