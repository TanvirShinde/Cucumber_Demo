Feature: Login

Background:
Given User Launch Chrome browser 
	When User opens URL "https://www.apps.dalalstreet.ai/login" 
	And User enters Email as "amarwaghmare573@gmail.com" and Password as "Test@1234" 
	And Click on Login 

 
@HomePageSmoke @all
Scenario: Successful Login with Valid Credentials 
	
	Then Page Title should be "Dashboard | PaperTrader by Dalalstreet.ai" 
	When User click on Log out link 
	Then Page title should be "See you soon | Dalalstreet.ai - Deep learning tools for financial markets"
	And close browser


	

	

