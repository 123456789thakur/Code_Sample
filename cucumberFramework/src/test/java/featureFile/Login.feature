feature: Login into account
      Exisiting user should be able to login to account using correct credentials
      
      
      Secnarios: Login into account with correct credentials.
      Given: user navigate to stack overflow website
      And: user click on the login button 
      And: user enter a valid username 
      And : user enter a valid password
      when: user click on a login button
      Then: user should be taken to successful login page
  
  
  Feature: Login into account

Scenario Outline: Login to account with credentials
	Given user navigates to "<url>" 
	When user clicks on the login portal button
	And user enters the "<username>" username
	And user enter the "<password>" password
	When user clicks on the login button
	Then the user should be presented with the following prompt alert "<message>"
	
	
	Examples:
	| 	url 							| 		username 		|		 password		 |		 message		 |
	|http://www.webdriveruniversity.com/|	webdriver3			|		wendriver 		 | validation failed     |
	|http://www.webdriveruniversity.com/|	webdriver			|		webdriver123	 | validation succeeded  |
  