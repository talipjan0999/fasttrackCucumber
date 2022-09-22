Feature: Navigation menu

  @nv
  Scenario: driver navigation menu
    Given user at login page
    When  user provide "driver"  information
    Then  user should be see below options
    |Fleet|
    |Customers|
    |Activities|
    |System    |
@sm
  Scenario: driver navigation menu
    Given user at login page
    When  user provide "sales manager"  information
    Then  user should be see below options
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales |
      |Activities|
      |Marketing |
  |Reports & Segments|
  |System            |
