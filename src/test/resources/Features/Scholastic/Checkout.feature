@Checkout @regression
Feature: Checkout

  Background:Given I am on Login Page

  @Checkout-1
  Scenario: Verify teacher can add multiple books for a student in SFO
      Then I enter scholastic account email as 'aiswaryan777@gmail.com'
        And I enter scholastic password as 'gokulam1'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
        And I click on 'Student Flyer Orders' under 'Enter Orders' tab
      Then I enter student's name as 'Harry'
        And I enter '35J3' as the item number
        And I click on add button
      Then I enter '2' in qty box on SFO page
        And I enter '35N3' as the item number
        And I click on add button
      Then I enter '4' in qty box for box 1 on SFO page
        And I enter '16B3' as the item number
        And I click on add button
      Then I enter '1' in qty box for box 2 on SFO page
      Then I verify the student name are same as 'Harry' gets added under SFO
        And I verify the item number '16B3' gets added under SFO
        And I verify the item number '35N3' gets added under SFO
        And I verify the item number '35J3' gets added under SFO
        And I verify the qty number '1' gets added under SFO
        And I verify the qty number '4' gets added under SFO
        And I verify the qty number '2' gets added under SFO
      Then I click on 'Review Cart' Button
      Then I verify item number '16B3' is 1st present on 'Review Your Cart' Page
        And I verify the item number '35N3' is 2nd present on 'Review Your Cart' Page
        And I verify the item number '35J3' is present 3rd on 'Review Your Cart' Page
        And I verify the qty number '1' is present for book 16B3
        And I verify the qty number '4' is present for book 35N3
        And I verify the qty number '2' is present for book 35J3
      Then I verify price for book 16B3 is present
        And I verify price for book 35N3 is present
        And I verify price for book 35J3 is present
      Then I verify number of students is correct as present
        And I verify the qty total is correct as present
        And I verify student total is correct as present
        And I verify total amount is correct as present

  @Checkout-2
  Scenario: Verify teacher can add multiple books for multiple students in SFO
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
      And I click on 'Review Cart' Button
    Then I verify all students names are present after adding them
      And I verify all item numbers are present after adding them
      And I verify all quantity numbers are present after adding them
      And I verify student total is correct as present
      And I verify summary total is correct as present









