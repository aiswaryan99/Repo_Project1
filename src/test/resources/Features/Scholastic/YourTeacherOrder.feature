@Jumper
Feature: Your Teacher Order

  @Jumper-1
  Scenario: Verify YTO-By Flyer jumper
    Given I am on Login Page
      Then I enter scholastic account email as 'aiswaryan777@gmail.com'
        And I enter scholastic password as 'gokulam1'
        And I click on sign in button
      Then I hover over the 'Enter Orders' tab under Scholastic Book Clubs
      Then I click on 'Your Teacher Order' under 'Enter Orders' tab
      Then I click on one of the qty boxes
        And I verify 'Heading - IMPORTANT'
        And I verify pop-up message 'All student paper flyer orders MUST be entered in the Student Flyer Orders tab.'
      Then I enter '2' in qty box on YTO page
        And I close the pop-up message
      Then I verify the pop-up message no longer appears


