Feature: Avon Cycles 

@sc1
Scenario: Account Login Check
Given User lands on the homepage
When User clicks on new launches and clicks on heart icon a new window opens
Then User inputs values in login account and clicks on Login button
And User clicks on the link to open new page
Then User inputs the values in the input Signup field
And User clicks on the Signup button 

@sc2
Scenario: Treadmill check
Given User lands on the homepage
When User clicks on Avon Fitness Machine a new window opens
Then User handles the pop up to hover on Domestic Gym and Cardio line 
Then User clicks on Treadmills and clicks on the first product 
And User then clicks on the Enquire Now button and handles the popup
Then User inputs the values in Enquiry form 