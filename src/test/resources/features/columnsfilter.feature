@invoice-manager
Feature: Columns filter option from list products
  Columns from the columns tab, the selected columns
  should be displayed in the List products page

  Background:
    Given I'm logged in as a admin user to invoice manager

  @columns-filter
  Scenario: Selected columns should be displayed
    When I navigates to list products page
    Then I select a column option and verify in the table

  @columns-filter-all-options
  Scenario Outline: Selected name column should be displayed
    When I navigates to list products page
    Then I select "<COLUMN_NAME>" column option and verify in the table
    Examples:
      | COLUMN_NAME |
      | Name        |
      | Details     |
      | Price       |
      | Tax Rate    |
      | Tax Method  |
      | Actions     |