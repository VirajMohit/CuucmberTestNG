Feature: Contact

@SmokeTest
Scenario: Add Contact
	Given User is signed in
	Then Adds contact

@SmokeTest
Scenario: View Contact
	Given User is signed in
	Then Views contact details

@RegressionTest
Scenario: Update Contact
	Given User is signed in
	Then Updates contact

@RegressionTest
Scenario: Delete Contact
	Given User is signed in
	Then Deletes contact
	
	