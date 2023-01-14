Feature: Login 

  @Smoke @all
  Scenario Outline:Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://www.apps.dalalstreet.ai/login" 
	Then User enters Email as "<Email>" and Password as "<Password>"
	And Click on Login 
	Then Page Title should be "Dashboard | PaperTrader by Dalalstreet.ai" 
	When User click on Log out link 
	Then Page title should be "See you soon | Dalalstreet.ai - Deep learning tools for financial markets"
	And close browser
	
	Examples:
	| Email | Password |
	| amarwaghmare573@gmail.com | Test@1234 |
	| Tanvir@gmail.com | Test@1234 | 	
	
	@Regression @all
	Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://www.apps.dalalstreet.ai/login" 
	And User enters Email as "Tanvir@gmail.com" and Password as "Test@1234" 
	And Click on Login 
	Then Page Title should be "Dashboard | PaperTrader by Dalalstreet.ai" 
	When User click on Log out link 
	Then Page title should be "See you soon | Dalalstreet.ai - Deep learning tools for financial markets"
	And close browser 
	
	
	

