Feature: Application Login


Scenario: Home Page default Login 

Given User is on netbanking landing page
When User Login into application with user and password
Then homepage is populated
And all the cards should be dispplayed 