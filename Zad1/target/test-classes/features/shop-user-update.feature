@Zad1
Feature: Change add new adress

  Scenario Outline: Change all user adress informations
    Given User is logged in to mytore
    When User goes to Add adress tab
    And User alias is "<alias>"
    And User adress is "<adress>"
    And User city is "<city>"
    And User zipcode is "<zipcode>"
    And User country is "<country>"
    And User phone is "<phone>"

    Then User click save button
    And User sees confirmation that changes are saved
    And Close browser


  Examples:
  |alias|adress|city|zipcode|country|phone|
  |Tester|testowa95|tesowawioska|95-034|United Kingdom|584624574|

#    And close shop browser