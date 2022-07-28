Feature: Discvoery Splash
	
Scenario Outline: Verify Splash page displayed
	Given User launches Discovery App
	When "<User>" closes Privacy popup on splash page
	Then Splash page should be displayed
	Then User closes browser
Examples:
	|User|
	|User1|