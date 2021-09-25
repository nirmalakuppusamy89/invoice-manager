Feature: Login
  Scenario: Login with valid credentials
    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page