package org.junitpractice;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoJunit extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
   browserLaunch("chrome");
   maximise();
   loadUrl("https://blazedemo.com/");
	}
	@Test
	public void e() throws Exception {
		String excelRead = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 0);
		System.out.println(excelRead);
		
		selectByVisibleText(findingElement("xpath", "//*[@name='fromPort']"), excelRead);
		Thread.sleep(1000);
		String excelRead1 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 1);
		System.out.println(excelRead1);
		
		selectByVisibleText(findingElement("xpath", "//*[@name='toPort']"), excelRead1);
		
		elementClick(findingElement("xpath", "//*[@value='Find Flights']"));
	}
	@Test
		public void f() {
		elementClick(findingElement("xpath", "(//input[@value='Choose This Flight'])[1]"));
		
	
	}
	@Test
	public void g() throws IOException {
		String excelRead2 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 2);
		findingElement("id", "inputName").sendKeys(excelRead2);
		String excelRead3 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 3);
		findingElement("id", "address").sendKeys(excelRead3);
		String excelRead4 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 4);
		findingElement("id","city").sendKeys(excelRead4);
		String excelRead5 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 5);
		findingElement("id", "state").sendKeys(excelRead5);
		String excelRead6 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 6);
		findingElement("id", "zipCode").sendKeys(excelRead6);
		String excelRead7 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 7);
		selectByVisibleText(findingElement("id", "cardType"),excelRead7);
		String excelRead8 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 8);
		findingElement("id", "creditCardNumber").sendKeys(excelRead8);
		
		String excelRead9 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 9);
		findingElement("id", "creditCardMonth").sendKeys(excelRead9);
		
		String excelRead10 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 10);
		findingElement("id", "creditCardYear").sendKeys(excelRead10);
		String excelRead11 = excelRead("src\\test\\resources\\Book1.xlsx", "Sheet3", 1, 11);
		findingElement("id", "nameOnCard").sendKeys(excelRead11);
		elementClick(findingElement("id", "rememberMe"));
		elementClick(findingElement("xpath","//input[@value='Purchase Flight']"));
	}
   
}
	
	
		
		
		
		
	


