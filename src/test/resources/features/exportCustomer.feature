@invoice-manager
  Feature: Export all the available Customer list
    As a system admin of Invoice Manager
    I should be able to export all existing Customer list in the system
    using different format

  Background:
    Given I'm logged in as a admin user to invoice manager

    Scenario:  Export customer list to all the files and verify as a admin user
      When I navigates to list customer page
      And I can download the table content in different formats
      Then verify the downloaded files