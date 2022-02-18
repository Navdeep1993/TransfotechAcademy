Feature: 
As a user i want to subscribe to newstletter

Scenario: Email test with valid credentials
Given user is on blog detail page
When user enter valid credientials 
And hit enter
Then user should see form sent successfully message


Scenario: Positive functionality test with button
Given user is on blog detail page
When user enter valid credientials 
And press send button
Then user should see form sent successfully message

Scenario: Functionality test with invalid credientials
Given user is on blog detail page
When user enter invalid credientials 
And hit enter
Then user should see error message


Scenario: Email test without dot
Given user is on blog detail page
When user enter email without dot 
And hit enter
Then user should see error message


Scenario: Email test without top level domain
Given user is on blog detail page
When user enter email without top level domain 
And hit enter
Then user should see error message


Scenario: Email test with Negative credientials 
Given user is on blog detail page
When user enter invalid credientials 
And press send button
Then user should see error message


Scenario: Email test without dot and button
Given user is on blog detail page
When user enter email without dot 
And press send button
Then user should see error message

Scenario: Email test without top level domain and button
Given user is on blog detail page
When user enter email without top level domain 
And press send button
Then user should see error message

