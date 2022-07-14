Feature: As a store manager or Sales manager I can access Vehicle Costs page


Scenario: Verify that store manager or Sales manager can access Vehicle Costs page
  Given the user is on the home page
  When the user hovers with the mouse over the Fleet button
  When the user clicks on the Vehicle Costs button
  Then the user should be able to see the Vehicle Costs page

