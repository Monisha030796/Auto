package org.junitpractice;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Practice extends BaseClass{
	static WebElement userName;
	static WebElement password;
	static WebElement loginButton;
	static WebElement location;
	static WebElement hotels;
	static WebElement roomType;
	static WebElement roomNumber;
	static WebElement checkIn;
	static WebElement checkOut;
	static WebElement adult;
	static WebElement child;
	static WebElement search;
	static WebElement button;
	static WebElement continueButton;
	static WebElement firstName;
	static WebElement lastName;
	static WebElement address;
	static WebElement cardNum;
	static WebElement cardType;
	static WebElement month;
	static WebElement year;
	static WebElement cvv;
	static WebElement booknow;
	
	@BeforeClass
	public static void initialSet() {
		browserLaunch("chrome");
		maximise();
		loadUrl("https://adactinhotelapp.com/");
}
@Test
       public void tc1() {
	LoginHotel loginHotel=new LoginHotel();
	userName=loginHotel.getUsername();
	password=loginHotel.getPassword();
	loginButton=loginHotel.getLoginButton();
	//SearchHotel searchHotel=new SearchHotel();
	//location=searchHotel.getLocation();
	
	
			
}
@Test
public void tc2() throws IOException, InterruptedException {
	String name = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 0);
	String pass = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 1);
	String title = driver.getTitle();
	System.out.println(title);
	passValue(userName, name);
	passValue(password,pass);
	screenShot();
	elementClick(loginButton);
	
	
}
@Test
public void tc3(){
	SearchHotel searchHotel=new SearchHotel();
	 location = searchHotel.getLocation();
	 hotels=searchHotel.getHotels();
	 roomType=searchHotel.getRoomType();
	 roomNumber=searchHotel.getRoomnumber();
	 checkIn=searchHotel.getCheckIn();
	 checkOut=searchHotel.getCheckOut();
	 adult=searchHotel.getAdultRoom();
	 child=searchHotel.getChildRoom();
	 search=searchHotel.getSearch();
	 
	
}
@Test
public void tc4() throws IOException {
	String location1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 2);
	String hotels1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 3);
	String roomType1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 4);
	String roomnumber1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 5);
	String checkin1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 6);
	String checkout1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 7);
	String adults1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 8);
	String child1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 9);
	passValue(location, location1);
	passValue(hotels, hotels1);
	passValue(roomType,roomType1);
	passValue(roomNumber, roomnumber1);
	passValue(checkIn, checkin1);
	passValue(checkOut, checkout1);
	passValue(adult, adults1);
	passValue(child, child1);
	String title = driver.getTitle();
	System.out.println(title);
	screenShot();
	elementClick(search);
	//elementClick(button);
}
@Test
public void tc5() throws IOException {
	SelectHotel select=new SelectHotel();
	button=select.getButton();
	screenShot();
	continueButton=select.getContinueButton();
	
}
@Test
public void tc6() {
	elementClick(button);
	elementClick(continueButton);
}
@Test
public void tc7() {
	BookHotel hotel=new BookHotel();
	firstName=hotel.getFirstName();
	lastName=hotel.getLastName();
	address=hotel.getAddress();
	cardNum=hotel.getCardNum();
	cardType=hotel.getCardType();
	month=hotel.getMonth();
	year=hotel.getYear();
	cvv=hotel.getCvv();
	booknow=hotel.getBooknow();
	
	
}
@Test
public void tc8() throws IOException {
	String first = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 10);
	String last = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1,11);
	String add = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 12);
	String caNum = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 13);
	String caType = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 14);
	String month1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 15);
	String year1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 16);
	String cvv1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet2", 1, 17);
	passValue(firstName, first);
	passValue(lastName, last);
	passValue(address,add);
	passValue(cardNum, caNum);
	passValue(cardType, caType);
	passValue(month, month1);
	passValue(year, year1);
	passValue(cvv, cvv1);
	 screenShot();
	elementClick(booknow);
}
//@After
//public void tc9() throws IOException, InterruptedException   {
//	//Thread.sleep(3000);
//		   screenShot();
//		 Thread.sleep(3000);
//	   }

@AfterClass
public static void tc10() {
	quitBrowser();
}


}
