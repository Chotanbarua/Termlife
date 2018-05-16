@Quote
Feature: Life_Ins_Quote

In order to Get A Traditonal Term Quote
As a user 
I want to enter Zip Code, Select Gender, Select DOB, Select AAA membership, Enter Email, Select Height, Enter Weight,
Select Last nicotine last use, Coverage Ammount, Term Length and Click See your Quote button. 

Scenario:  Positive

Given User Get Traditonal Term Quote page
When User enters Zip Code
And User Select Gender
And User Select Dob
And User Select AAA membership
And User Enters Email
And User Select Height
And User Enters Weight
And User Select Nicotine Last use
And User Select Rate Your Health
And User Select Coverage Amount
And User Select Term Length
And User Click on See Your Quote Button
Then User lands on Quote Results page.