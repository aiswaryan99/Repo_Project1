Feature: Student Flyer Order

  Background: Given I am on Login Page

  Scenario: Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
      Then I enter scholastic account email as 'aiswaryan777@gmail.com'
        And I enter scholastic password as 'gokulam1'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
        And I click on 'Student Flyer Orders' under 'Enter Orders' tab
      Then I enter student's name as 'Harry'
        And I enter '111' as the item number
        And I click on add button
      Then I verify the pop-up message 'Please enter a valid item number.'

  Scenario: Verify user can delete item on Cart page
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
      Then I enter student's name as 'John'
        And I enter '16B3' as the item number
      Then I enter '2' in qty box for box 6
      Then I click on 'Review Cart' Button
        And I verify total quantity before clicking x button
      Then I click on 'x' button
        And I verify the total quantity has lowered after clicking x













