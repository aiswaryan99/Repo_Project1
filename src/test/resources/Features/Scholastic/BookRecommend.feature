@Recommend
Feature: Recommended Books

  @Recommend-1
  Scenario: Teacher can add books in Recommendations List from Quick View
      Given I am on Login Page
        Then I enter scholastic account email as 'aiswaryan777@gmail.com'
          And I enter scholastic password as 'gokulam1'
        Then I click on sign in button
        Then I search 'Harry' in Search by Title, Author, Item # or Keyword Box
          And I click on magnifying glass button
        Then I click on 'Quick Look' on 'Harry Potter and the Order of the Phoenix'
        Then I click on the star button
          And I click on the Recommendations to Students Box
          And I click on x button to close
          And I click on x to close quick look
        Then I scroll up and click on My Lists
          And I click on Recommendations to Students from the dropdown
        Then I verify the book is displayed to Recommendations for Students List



