Feature: Hotel Booking In Adacting Application
@login
Scenario: User Login In The Web Application
Given user Lanuch The Url In Adactin Application 
When user Enter The Username  In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page 

@search_hotel 
Scenario: User Search Hotel In Search Web Application Page
When user Choose The Location In The Location Dropdown Field
And user Select The Hotels In The  Dropdown Field 
And user Select The Roomtype In The Select Roomtype Dropdown Field
And user Choose The Number Of Room In The Dropdown Field
And user Enter Check In Date In The Dates Field
And user Enter Check Out Date In The Date Field 
And user  Select The Adults Per Room In The Dropdown Field
And user Choose The Children Per Room In The Dropdown Field
Then user Click The Search Button And It Navigate To Next Page 

@selecthotel
Scenario: User Select Hotel In The Select Page 
When user Choose The Select Hotel In The Below The Ratio Button
Then user Click The Continue Button And It Navigate To Next Page 

@book_hotel
Scenario: User Book The Hotel In The Book A Hotel Page 
When user Enter The First Name In The First Name Field 
And user Enter The Last Name In The Last Name Field 
And user Enter The Billing Address In The Address Field
And user Enter The Credit Card No In The Credit Card Field 
And user Choose The Credit Card Type In The Below   The Dropdown Field
And user Choose The Month And Year In The Below The Dropdown Field
And user Enter The CVV Number In The Cvv Number Field
Then Click The Book Now Button And It Navigate To Next Page 






























































