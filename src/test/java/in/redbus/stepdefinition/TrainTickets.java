package in.redbus.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import in.redbus.objectrepo.TrainTicketsLocator;
import in.redbus.reusable.CommonAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainTickets extends CommonAction {
	TrainTicketsLocator tc=new TrainTicketsLocator();
	public static WebDriver driver;

	@Given("Launch the {string}")
	public void launch_the(String string) {
		 CommonAction.driver.get(string);
	}
	@When("User clicks on train tickets")
	public void user_clicks_on_train_tickets() {
          click(tc.getTrain());		
	}
	@When("User enters the from station")
	public void user_enters_the_from_station() throws InterruptedException {
		passValue(tc.getFrom(), "Chennai");
		Thread.sleep(2000);
       click(tc.getLocation());
	}
	@When("User enters the to station")
	public void user_enters_the_to_station() throws InterruptedException {
      passValue(tc.getTo(), "Tirunelveli");
      Thread.sleep(2000);
     click(tc.getLocation1());
	}
	@When("User selects a date in calender")
	public void user_selects_a_date_in_calender() {
     click(tc.getCalender());
     click(tc.getDate());
	}
	@When("User click on search trains")
	public void user_click_on_search_trains() {
		click(tc.getSearch());
	}
	@Then("Validate the trains available")
	public void validate_the_trains_available() {
    List<WebElement> trains = CommonAction.driver.findElements(By.xpath("//span[@class='srp_train_name']"));
    List<WebElement> departureTime = CommonAction.driver.findElements(By.xpath("//span[@class='srp_departure_time']"));
    List<WebElement> arrivalTime = CommonAction.driver.findElements(By.xpath("//span[@class='srp_arrival_time']"));
    for(int i=0;i<trains.size();i++) {
    	String train = trains.get(i).getText();
    	String departure = departureTime.get(i).getText();
    	String arrival = arrivalTime.get(i).getText();
    	System.out.println("TrainName: " +train+" "+"Departure Time :" +departure+" "+"Arrival Time :" +arrival);
    	
    }
	}
//	@When("User enters the from station {string}")
//	public void user_enters_the_from_station(String fromPlace) throws InterruptedException {
//		ca.passValue(tc.getFrom(), fromPlace);
//		Thread.sleep(2000);
//		WebElement location = driver.findElement(By.xpath("//div[text()='"+fromPlace+" - All Stations']"));
//    ca.click(location);
//	}
//	@When("User enters the to station with one dim list")
//	public void user_enters_the_to_station_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//	   List<String> asList = dataTable.asList();
//	   String toPlace = asList.get(asList.size()-1);
//	ca.passValue(tc.getTo(), toPlace);
//	   Thread.sleep(2000);
//		WebElement location = driver.findElement(By.xpath("(//div[text()='"+toPlace+"'])[1]"));
//ca.click(location);
//	}
//
//	@When("User selects a date in calender with one dim map")
//	public void user_selects_a_date_in_calender_with_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//     Map<String, String> map = dataTable.asMap(String.class, String.class);
//     String date = map.get("Date2");
//     Thread.sleep(4000);
//     ca.click(tc.getCalender());
// 	WebElement date1= driver.findElement(By.xpath("//span[text()='"+date+"']"));
// 	ca.click(date1);
//	}
	
	@When("User click on bus tickets")
	public void user_click_on_bus_tickets() {
		WebElement bus = driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
       click(bus);
	}

	@When("User click the from station {string}")
	public void user_click_the_from_station(String fromPlaces) throws InterruptedException {
		WebElement froms = driver.findElement(By.id("src"));
		froms.sendKeys(fromPlaces);
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("//text[text()='"+fromPlaces+"']"));
		location.click();
	}

	@When("User click on to station with one dim list")
	public void user_click_on_to_station_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<String> asList = dataTable.asList();
		   String toPlaces = asList.get(asList.size()-1);
		   WebElement to1 = driver.findElement(By.id("dest"));
			to1.sendKeys(toPlaces);
			Thread.sleep(2000);
			WebElement location = driver.findElement(By.xpath("(//text[text()='"+toPlaces+"'])"));
			location.click();
	}

	@When("Use selects a date in calander with one dim map")
	public void use_selects_a_date_in_calander_with_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	
		     Map<String, String> map = dataTable.asMap(String.class, String.class);
		     String date = map.get("Date2");
		     Thread.sleep(4000);
		 	WebElement calender = driver.findElement(By.xpath("//span[text()='Date']"));
		 	calender.click();
		 	WebElement date1= driver.findElement(By.xpath("//*[text()='"+date+"']"));
		 	date1.click();
	
	
	}

	@When("User click on search buses")
	public void user_click_on_search_buses() {
		WebElement search = driver.findElement(By.xpath("//button[text()='SEARCH BUSES']"));
		search.click();
	
	}

	@Then("Validate the buses available")
	public void validate_the_buses_available() {

	
	}

	@When("User clicks on the cab rents")
	public void user_clicks_on_the_cab_rents() {

	WebElement cab = driver.findElement(By.xpath("//span[text()='Cab Rental']"));
	cab.click();
	}

	@When("User enters the start station {string}")
	public void user_enters_the_start_station(String fromPlaces1) throws InterruptedException {
		WebElement froms1 = driver.findElement(By.id("source"));
		froms1.sendKeys(fromPlaces1);
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("//div[text()='"+fromPlaces1+"']"));
		location.click();
	
	}

	@When("User click the end station with one dim list")
	public void user_click_the_end_station_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> asList = dataTable.asList();
		   String toPlaces = asList.get(asList.size()-1);
		   WebElement to1 = driver.findElement(By.id("destination"));
			to1.sendKeys(toPlaces);
			Thread.sleep(6000);
			WebElement location = driver.findElement(By.xpath("//div[text()='Tenkasi']"));
			location.click();
	}

	@When("User selects a date and time in calender with one dim map")
	public void user_selects_a_date_and_time_in_calender_with_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	     Map<String, String> map = dataTable.asMap(String.class, String.class);
	     String date = map.get("Date2");
	     Thread.sleep(4000);
	 	WebElement calender = driver.findElement(By.xpath("//div[@class='b5HOQtQiKpo8YWQDVMNv']"));
	 	calender.click();
	 	Thread.sleep(4000);
	 	WebElement date1= driver.findElement(By.xpath("(//p[text()='"+date+"'])[2]"));
	 	date1.click();
	 	WebElement ok= driver.findElement(By.xpath("//*[text()='OK']"));
	 	ok.click();
	}

	@When("User click on search cabs")
	public void user_click_on_search_cabs() {
		WebElement calender = driver.findElement(By.xpath("//div[text()='SEARCH']"));
	 	calender.click();
	 	
	}

	@Then("Validate the cabs available")
	public void validate_the_cabs_available() {
	    
	}

}
