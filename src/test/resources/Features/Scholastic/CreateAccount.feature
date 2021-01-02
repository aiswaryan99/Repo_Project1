Feature: Create Account

  Background: Given I am on landing page
    When I click on Create an Account
    And I click on Teacher/Administrator/Homeschooler
    And I click on Next Button
    Then I select 'Mrs.' in Title dropdown
    And I enter first name as 'Aiswarya'
    And I enter last name as 'Nair'
    And I enter email as 'dollbaby7516@gmail.com'
    And I enter password as 'testing123'
    And I click the box for terms and accept
    Then I click on Next button

  Scenario: Verify CLASS CODE allocated to the teacher is present on Home-Page and MyAccount-Page
    When I click on Create an Account
    And I click on Teacher/Administrator/Homeschooler
    And I click on Next Button
    Then I select 'Mrs.' in Title dropdown
    And I enter first name as 'Aiswarya'
    And I enter last name as 'Nair'
    And I enter email as 'badboy125@gmail.com'
     And I enter password as 'testing123'
      And I click the box for terms and accept
    Then I click on Next button
      Then I enter zipcode as '10012'
        And I click on search button
      Then I enter 'SCHOLASTIC' School Name field
        And I click on 'SCHOLASTIC+BOOK+CLUBS'
      Then I click on Next Button after selecting School
        And I select role as 'Teacher (by Grade)'
      Then I select the grade as '1st Grade'
        And I enter number of students as '10'
        And I click on the next button
      Then I select 'Guided Reading Level (GRL)' as preferred reading level
        And I click on Continue to Site button
      Then I obtain class code after logging in

    Scenario: Verify Same Class Code on Home Page and My Account Page
      Then I enter scholastic account email as 'badboy125@gmail.com'
        And I enter scholastic password as 'testing123'
        And I click on sign in button
        And I obtain class code from my account page
      Then I verify the class code in the same on Login Page and My Account Page
        And I verify the teacher's name is present and is the same as created
        And I verify the school address is present and is the same as created

  Scenario: User can create a new teacher account in non-taxable state using Zip Code
      Then I enter zipcode as '99518'
        And I click on search button
      Then I enter 'ADAK' School Name field
        And I click on 'Adak School'
      Then I click on Next Button after selecting School
        And I select role as 'Teacher (by Grade)'
      Then I select the grade as '1st Grade'
        And I enter number of students as '10'
        And I click on the next button
      Then I select 'Guided Reading Level (GRL)' as preferred reading level
        And I click on Continue to Site button
      Then I obtain class code after logging in
        And I verify the teacher's name is present and is the same as created
        And I verify the school address is present and is the same as created

    Scenario: User can create a new teacher account in taxable state using School Search
      Then I click 'New York' as state
        And I click on 'New York' as city
        And I click on Search Button
      Then I enter 'SCHOLASTIC' School Name field
        And I click on 'SCHOLASTIC+BOOK+CLUBS'
      Then I click on Next Button after selecting School
        And I select role as 'Teacher (by Grade)'
      Then I select the grade as '1st Grade'
        And I enter number of students as '10'
        And I click on the next button
      Then I select 'Guided Reading Level (GRL)' as preferred reading level
        And I click on Continue to Site button
      Then I obtain class code after logging in
        And I verify the teacher's name is present and is the same as created










