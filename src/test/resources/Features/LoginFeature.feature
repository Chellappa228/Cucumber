Feature: Adactin Details


Scenario: verifying the Adactin login with valid credentials

Given User is on Adactin page
When User should enter the username and password
And should click the login button
Then check redirects to booking module