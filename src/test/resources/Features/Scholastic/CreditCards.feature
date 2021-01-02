@CreditCards
Feature: Credit Cards

  @CreditCards-1
  Scenario: Verify teacher can add only 3 credit cards under My Credit Cards in My Accounts
   Given I am on Login Page
     Then I enter scholastic account email as 'aiswaryan777@gmail.com'
       And I enter scholastic password as 'gokulam1'
       And I click on sign in button
     Then I click on My Account
      And I click on My Profile
     Then I click on Add a Card
       And I enter card number as '6011111111111117'
       And I select month as '10'
       And I select year as '2023'
       And I enter security code as '531'
       And I enter first name as 'William' in first name field
       And I enter last name as 'Snow' in last name field
       And I enter address as '52 Longbeach Road'
       And I enter zipcode as '11561' in zipcode field
       And I enter phone number as '2126859354'
     Then I click on save button
     Then I click on Add a Card again
     Then I verify that the 'You can only store three credit cards' message appears










