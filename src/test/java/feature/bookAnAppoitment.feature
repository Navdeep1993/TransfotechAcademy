
Feature: As a user i want to book an appointment

Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user fill valid Firstname, lastname,Email,PhoneNumber,appoitment subject, Convenient date,interested in, message
And hit enter
Then user should see message sent successfully message



Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter invalid Firstname 
And hit enter
Then user should see error message
And Cursor should not move to next field



Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter invalid Lastname 
And hit enter
Then user should see error message
And Cursor should not move to next field




Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user enter invalid Email 
And hit enter
Then user should see error message
And Cursor should not move to next field



Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user enter Email without dot
And hit enter
Then user should see error message
And Cursor should not move to next field


Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user enter Email without lop level Domain
And hit enter
Then user should see error message
And Cursor should not move to next field


Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter invalid Phonenumber 
And hit enter
Then user should see error message
And Cursor should not move to next field



Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter Phonenumber less than 10
And hit enter
Then user should see error message
And Cursor should not move to next field

Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter Phonenumber with alphabets
And hit enter
Then user should see error message
And Cursor should not move to next field


Scenario:
Given user is on transotech website
When click on book an appoitnment tab
And a pop-up appear
And user Enter Phonenumber more than 15
And hit enter
Then user should see error message
And Cursor should not move to next field

