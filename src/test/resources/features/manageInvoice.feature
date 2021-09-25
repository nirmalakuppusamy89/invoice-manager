@invoice-manager
  Feature: Create/update/delete invoice test
    As a system admin of Invoice Manager
    I should be able to update existing Invoice in the system
    the same can be deleted from List Invoice page

  Background:
    Given I'm logged in as a admin user to invoice manager

    @create-invoice
    Scenario: Create invoice and verify as admin user
      When I navigate to add sales page
      And I enter all the required fields in add sales page
      And I click Add Invoice Button
      Then verify invoice successfully added message in list invoices page
















