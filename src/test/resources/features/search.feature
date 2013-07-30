Feature: Google Search
In order to learn more
As an information seeker
I want to find more information

@wikipedia
Scenario: Find what I'm looking for
Given I am on the Google search page
When I search for "Wikipedia"
Then I should see the results page
And The first link should be "Wikipedia"

@youtube
Scenario: Find what I'm looking for
Given I am on the Google search page
When I search for "YouTube"
Then I should see the results page
And The first link should be "YouTube"
