@invoice-manager
Feature: Login Feature Test
  As an invoice manager admin user
  I should able to login to invoice manager
  So that I can add/modify invoices

  Background:
    Given I'm on the invoice manager login page

  @login
  Scenario: verify user can login to invoice manager
      When I enter invoice manager admin username and password
      And I click login button
      Then I should redirected to invoice manager home page