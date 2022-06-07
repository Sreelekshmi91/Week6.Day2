Feature: LeaftTaps Create Lead functionality

Scenario: Create Lead with mandatory information

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then My HomePage should be displayed
When Click on Lead
When Click on Create Lead
Given Enter the Company Name as 'TestLeaf'
Given Enter the First Name as 'Sreelekshmi'
Given Enter the Last Name as 'S'
When Click on submitButton