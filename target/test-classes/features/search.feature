Feature: Google Search for Wikipedia
In order to learn more
As an information seeker
I want to find more information

Scenario: Find what I'm looking for
Given I am on the Google search page
When I search for "Wikipedia"
Then I am at the results page
And The first link should be "Wikipedia"