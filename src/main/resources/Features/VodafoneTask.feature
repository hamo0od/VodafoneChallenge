@Regression
  Feature:  Validate if the number of results on page 2 is equal to page 3 or not
    Scenario: check if the number of results on page 2 is equal to page 3 or not

      Given User Type and search for “Vodafone”
      And User click on search
      And User Scroll Down
      And user go to the second page
      And count search items in the second page
      And user go to the third page
      And count search items in the third page
      Then Check the number of searched Items in the second page equal to the third page