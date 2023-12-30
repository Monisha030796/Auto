$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/TrainTickets.feature");
formatter.feature({
  "name": "Book Train Tickets",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@redbus"
    }
  ]
});
formatter.background({
  "name": "General",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the \"https://www.redbus.in/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TrainTickets.launch_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book train tickets for Chennai to Tirunelveli",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@redbus"
    },
    {
      "name": "@train"
    }
  ]
});
formatter.step({
  "name": "User clicks on train tickets",
  "keyword": "When "
});
formatter.match({
  "location": "TrainTickets.user_clicks_on_train_tickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the from station",
  "keyword": "And "
});
formatter.match({
  "location": "TrainTickets.user_enters_the_from_station()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the to station",
  "keyword": "And "
});
formatter.match({
  "location": "TrainTickets.user_enters_the_to_station()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a date in calender",
  "keyword": "And "
});
formatter.match({
  "location": "TrainTickets.user_selects_a_date_in_calender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on search trains",
  "keyword": "And "
});
formatter.match({
  "location": "TrainTickets.user_click_on_search_trains()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the trains available",
  "keyword": "Then "
});
formatter.match({
  "location": "TrainTickets.validate_the_trains_available()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});