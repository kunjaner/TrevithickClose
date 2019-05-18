Feature: Search
  As a customer
  I want to search for a product
  So that i can view respetive product

  Scenario: Search for a product
    Given i am on homepage
    When i search for product "Nike"
    Then i should be able to see the result

  Scenario: Search for a product
    Given i am on homepage
    When i search for product "Adidas"
    Then i should be able to see the result

