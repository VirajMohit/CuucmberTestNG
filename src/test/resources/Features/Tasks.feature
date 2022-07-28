Feature: Task

@PhaseTwo @SmokeTest
Scenario: Add Task
	Given User is signed in
	Then Adds Task

@PhaseTwo
Scenario: View Task
	Given User is signed in
	Then Views Task details

@PhaseTwo @RegressionTest
Scenario: Update Task
	Given User is signed in
	Then Updates Task

@PhaseTwo	
Scenario: Delete Task
	Given User is signed in
	Then Deletes Task
	
	