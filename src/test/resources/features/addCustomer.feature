@invoice-manager
  Feature:Add/retrieve list customer test
    should be able to add new Customers into the system and the same
    can be retrieved using List Customers option

  Background:
    Given I'm logged in as a admin user to invoice manager

@add-customer
    Scenario: Add and retrieve customer list as a admin user
      When I navigate to add customer page
      And I enter all the required fields in add customer page
      And I click Add customer Button
      Then verify this page is not working error
