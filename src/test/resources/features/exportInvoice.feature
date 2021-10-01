@invoice-manager
Feature: Export all the available Invoice
  As a system admin of Invoice Manager
  I should be able to export all existing Invoice in the system
  using different format

  Background:
    Given I'm logged in as a admin user to invoice manager

  @export-invoice
  Scenario:Export invoice all the files and verify as a admin user
    When I navigates to list invoices page
    And I can download the table content in different formats
    Then verify the downloaded files

