Feature: Test
Description:

Background:
	Given user is logged in successfully to application
	
Scenario: Validate response status of GET api
	Given user create a GET Request
		And user add header ""
		And user add parameter ""
	When user execute request
	Then user should see response status code as ""
		And response type is ""