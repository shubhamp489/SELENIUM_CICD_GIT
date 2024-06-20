@tag
Feature: Launching WebBrowser

  @tag1
  Scenario: Launch web broswer
    Given Open google chrome

  @DropdownMenu
  Scenario: Dropdown Menu testing
    Given click on dropdown menu
    Then click on Use left-click here
    Then get all the value from drop down list
