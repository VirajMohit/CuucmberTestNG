Feature: Deal

@PhaseOne @SmokeTest
Scenario: Add Deal
	Given User is signed in
	Then Adds Deal

@PhaseOne
Scenario: View Deal
	Given User is signed in
	Then Views Deal details

@PhaseOne @RegressionTest
Scenario: Update Deal
	Given User is signed in
	Then Updates Deal

@PhaseOne @RegressionTest
Scenario: Delete Deal
	Given User is signed in
	Then Deletes Deal
	
	