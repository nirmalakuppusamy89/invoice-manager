@invoice-manager
  Feature:Columns filter option from list products
    Columns from the columns tab, the selected columns
    should be displayed in the List products page

  Background:
    Given I'm logged in as a admin user to invoice manager

    @columns-filter
    Scenario : Selected columns should be displayed
      When I navigates to list customer page
      And I clicks columns option from the header menu
      And I able to selects and unselects the columns option
      Then I verify the selects and unselects columns are displayed


