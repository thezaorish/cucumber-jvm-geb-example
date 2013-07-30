Feature: Google Search
In order to demonstrate the power of Cucumber and WebDriver combined
As a Cucumber instructor
I want to walk through a simple google search.

@wikipedia
Scenario: Show you how to search on google
Given I am on the Google search page
When I search for "Wikipedia"
Then I should see the results page
And The first link should be "Wikipedia"

@youtube
Scenario: Show you how to search on google
Given I am on the Google search page
When I search for "YouTube"
Then I should see the results page
And The first link should be "YouTube"
