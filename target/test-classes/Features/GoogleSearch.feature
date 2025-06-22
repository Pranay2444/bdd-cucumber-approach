Feature: Check google search functionality

Scenario: Validate google search is working

Given browser is open
And user is on the google search page
When user enters a text in google searchbox
And hits enter button
Then user is navigated to the Search Results page