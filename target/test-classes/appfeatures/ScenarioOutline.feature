Feature: Signup functionality
Background:
Given user is at signup page


Scenario Outline: signup to application
When user enters name as "<name>" on form
And user select gender as "<gender>"
And user select the slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber | 
| Eder | Male | 1 |
| Ron | Male | 2 |
| Diana | Female | 3 |
| Alex | Male | 5 |
