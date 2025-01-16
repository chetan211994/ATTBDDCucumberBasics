Feature: Opening bank account
Scenario: Opening bank account with nominee
Given user is at account page
When user enters following data
|FirstName|LastName|Email|phone|
|Erin|Smith|erin.smith@gmail.com|9988998899|
|Robert|Jackson|rober.jackson@gmail.com|982278877|
And user clicks on submit button
Then user should gets confirmation
