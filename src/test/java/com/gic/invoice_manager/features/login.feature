@invoice-manager
Feature: Login Feature Test
  As a user
  I should able to login to invoice manager

  Background:
    Given I'm on the invoice manager home page

  @login
  Scenario: verify user can login to invoice manager
      When I enter username and password
      And I click login button
      Then I should redirected to invoice manager dashboard page