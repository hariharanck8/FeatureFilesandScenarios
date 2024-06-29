Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	
	Given User is on Home Page
	When User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
	
Examples:
    | username   | password |
    | santhoshkumar | santhoshkumar@123 |
    | hariharan | ck@153 |