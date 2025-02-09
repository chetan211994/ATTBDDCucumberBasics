Feature: Homepage Functionality
@sanity
Scenario: validation of title page
Given I am at the landing page
Then Page title should contains "Shopping"

@sanity
Scenario: verify cart icon
Given I am at the landing page
Then cart icon should get display

@regression
Scenario: checkout the deals section
Given I am at the landing page
When I click on sports section
Then business tab should gets displayed
