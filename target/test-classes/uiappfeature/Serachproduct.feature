Feature: Search product
@sanity
Scenario: Verify search product functionality
Given I am at the landing page
When I search product as "mobile"
Then I should see the results

