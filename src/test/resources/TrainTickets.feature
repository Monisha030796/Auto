@redbus
Feature: Book Train Tickets

Background: General
Given   Launch the "https://www.redbus.in/"
@train
Scenario: Book train tickets for Chennai to Tirunelveli
When User clicks on train tickets
And User enters the from station
And User enters the to station 
And User selects a date in calender
And User click on search trains
Then Validate the trains available




#Background: General
#Given  Launch the "https://www.redbus.in/"
#Scenario: Book train tickets for Chennai to Tirunelveli
#When User clicks on train tickets
#And User enters the from station "Chennai"
#And User enters the to station with one dim list
#|Trichy|Virudunagar|Madurai|Tirunelveli|
#And User selects a date in calender with one dim map
#|Date1|25|
#|Date2|26|
#|Date3|27|
#And User click on search trains
#Then Validate the trains available


#Scenario: Book bus tickets for Thoothukudi to coimbatore

#When User click on bus tickets
#And User click the from station "Thoothukudi"
#And User click on to station with one dim list
#|Salem|karur|Coimbatore|
#And Use selects a date in calander with one dim map
#|Date1|26|
#|Date2|27|
#|Date3|28|
#And User click on search buses
#Then Validate the buses available


#Scenario: Book cab rental for karur to kodaikanal

#When User clicks on the cab rents
#And User enters the start station "Madurai"
#And User click the end station with one dim list
#|Salem|karur|Tenkasi|
#And User selects a date and time in calender with one dim map
#|Date1|26|
#|Date2|27|
#|Date3|28|
#And User click on search cabs
#Then Validate the cabs available
