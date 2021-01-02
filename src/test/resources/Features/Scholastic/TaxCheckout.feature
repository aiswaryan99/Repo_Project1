@Taxes
Feature: Taxes

  Background: Given I am on Login Page

  @Taxes-1
  Scenario: Verify zero tax for only SFO order in the checkout
      Then I enter scholastic account email as 'joseram5656@gmail.com'
        And I enter scholastic password as 'testing123'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
      Then I click on 'Student Flyer Orders' under 'Enter Orders' tab
      Then I enter student's name as 'John'
        And I enter '35J3' as the item number
      Then I click on add button
        And I enter '2' in qty box for box 1
      Then I enter student's name as 'Harry'
        And I enter '16B3' as the item number
      Then I click on add button
        And I enter '5' in qty box for box 2
      Then I enter student's name as 'Michael'
        And I enter '35N3' as the item number
      Then I click on add button
        And I enter '4' in qty box for box 3
      Then I enter student's name as 'Harry'
        And I enter '42J4' as the item number
      Then I click on add button
        And I enter '1' in qty box for box 4
      Then I enter student's name as 'Michael'
        And I enter '34B4' as the item number
      Then I click on add button
        And I enter '10' in qty box for box 5
      Then I click on 'Review Cart' Button
      Then I click on 'Proceed to Checkout' button
      Then I click on 'Proceed to Checkout' button again
      Then I verify if the tax amount is equal to zero

  @Taxes-2
  Scenario: Verify non-zero tax is present for SFO-YTO orders in the checkout for teacher with tax state school
    Then I enter scholastic account email as 'joseram5656@gmail.com'
      And I enter scholastic password as 'testing123'
      And I click on sign in button
    Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
    Then I click on 'Student Flyer Orders' under 'Enter Orders' tab
    Then I enter student's name as 'John'
      And I enter '35J3' as the item number
    Then I click on add button
      And I enter '2' in qty box for box 1
    Then I enter student's name as 'Harry'
      And I enter '16B3' as the item number
    Then I click on add button
      And I enter '5' in qty box for box 2
    Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
    Then I click on 'Your Teacher Order' under 'Enter Orders' tab
      And I click on one box to change the quantity of book one to '3'
      And I click on one box to change the quantity of book two to '6'
    Then I click on 'Review Cart' Button
      And I click on 'Proceed to Checkout' button
      And I click on 'Proceed to Checkout' button again
    Then I verify the tax amount is greater than zero

  @Taxes-3
  Scenario: Verify zero tax for SFO-YTO orders in the checkout for teacher with non-tax state school
    Then I enter scholastic account email as 'coldsnowman3434@gmail.com'
      And I enter scholastic password as 'testing123'
      And I click on sign in button
    Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
    Then I click on 'Student Flyer Orders' under 'Enter Orders' tab
    Then I enter student's name as 'Michael'
      And I enter '35N3' as the item number
    Then I click on add button
      And I enter '2' in qty box for box 1
    Then I enter student's name as 'Harry'
      And I enter '42J4' as the item number
    Then I click on add button
      And I enter '5' in qty box for box 2
    Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
    Then I click on 'Your Teacher Order' under 'Enter Orders' tab
      And I click on one box to change the quantity of book one to '4'
      And I click on one box to change the quantity of book two to '6'
    Then I click on 'Review Cart' Button
      And I click on 'Proceed to Checkout' button
      And I click on 'Proceed to Checkout' button again
    Then I verify if the tax amount is equal to zero







