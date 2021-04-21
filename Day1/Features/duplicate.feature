Feature: delete lead for Leaftaps



Scenario: TC0004_deletelead 

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on login button
Then HomePage Should be displayed
When Click on crm/sfa button
When Click on Leads
Given Find Lead clicked
Given Phone clicked
Given phonenumber '99'
When Find Lead1 clicked
When LeadList and duplicate clicked
When submitButton clicked
