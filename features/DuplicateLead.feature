Feature: LeaftTaps Duplicate Lead functionality

Scenario: Duplicate Lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then My HomePage should be displayed
When Click on Lead
When Click on Find Leads
When Click on Phone
Given Enter the Phone Number as 9
When Click on Find Leads1
And Thread
When Click on Lead ID
When Click on Duplicate Lead
When Click on submitButton