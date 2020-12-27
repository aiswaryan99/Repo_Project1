Feature: Student Flyer Order

  Scenario: Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
    Given I am on Login Page
      Then I enter scholastic account email as 'aiswaryan777@gmail.com'
        And I enter scholastic password as 'gokulam1'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
        And I click on 'Student Flyer Orders' under 'Enter Orders' tab
      Then I enter student's name as 'Harry'
        And I enter '111' as the item number
        And I click on add button
      Then I verify the pop-up message 'Please enter a valid item number.'










