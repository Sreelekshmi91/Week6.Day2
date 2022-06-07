Feature: LeaftTaps Merge Lead functionality

Scenario: Merge Lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then My HomePage should be displayed
When Click on Lead
When Click on Merge Leads
When Click on Widget of From Lead and First Resulting Lead
When Click on Widget of To Lead and Second Resulting Lead
When Click on Merge button
And Accept the Alert
When Click on Find Leads
Given Enter the Lead ID as 'leadID'
When Click on Find Leads1
Then Verify the title of the page
