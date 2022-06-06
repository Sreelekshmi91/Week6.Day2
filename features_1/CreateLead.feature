Feature: LeaftTaps Create Lead functionality


@functional @regression 
Scenario Outline: Create Lead with mandatory information

Given Enter the username as <username>
And Enter the password as  <password>
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then My HomePage should be displayed
When Click on Lead
When Click on Create Lead
Given Enter the Company Name as 'TestLeaf'
Given Enter the First Name as 'Sreelekshmi'
Given Enter the Last Name as 'S'
Given Enter the Phone Number1 as 9
When Click on submitButton

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|