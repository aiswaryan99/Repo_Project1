@Shipping
Feature: Shipping and Payment

  @Shipping-1
  Scenario: Verify user can place an order by adding a new credit card
    Given I am on Login Page
      Then I enter scholastic account email as 'joseram5656@gmail.com'
        And I enter scholastic password as 'testing123'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
      Then I click on 'Student Flyer Orders' under 'Enter Orders' tab
        And I click on 'Review Cart' Button
      Then I click on 'Proceed to Checkout' button
        And I click on 'Proceed to Checkout' button again
      Then I click on 'Continue Checkout' Button
        Then I click on 'Select Payment Method' box
        And I click on 'Credit Card' on dropdown
      Then I click on 'Select a Card' box
        And I click on 'Add a New Card' from dropdown
        And I enter card number as '6011111111111117'
        And I select month as '10'
        And I select year as '2023'
        And I enter security code as '531'
        And I enter first name as 'Jose' in first name field
        And I enter last name as 'Ram' in last name field
        And I enter address as '2290 Oak Street'
        And I enter zipcode as '13420' in zipcode field
        And I enter phone number as '2126859354'
      Then I click on 'Continue Checkout' Button again
      Then I click on 'Submit Order' Button
      Then I verify Thank You message is displayed
        And I verify the order receipt reference number is displayed


