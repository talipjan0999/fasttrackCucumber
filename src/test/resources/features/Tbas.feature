Feature:  Roles and Tabs
@mod
  Scenario Outline: different modules and diffrent titiles
    Given user at login page
    When user provide "<role>"  information
    And  user go to "<tab>" and "<module>"
    Then the title should be equal to "<title>"
    Examples:
      |role  |tab|module|title|
      |driver|Fleet|Vehicles Model|Vehicles Model - Entities -System -car -Entities - system|
      |driver|Customers|Contacts  |Contacts - Customers                                     |
      |driver|Activities|Calendar Events|Calendar Events - Activities                       |


