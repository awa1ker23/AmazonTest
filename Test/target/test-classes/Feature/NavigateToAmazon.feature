@tag
Feature: Order an item from Amazon

  @tag1
  Scenario: Search for an item
    Given I am on the Amazon homepage
    When I add text to the search field
    Then I can search for the item


  Scenario: Add item to the cart
    Given The item is displayed on a new page
    Then I can add it to the cart
    And see it it in the cart
