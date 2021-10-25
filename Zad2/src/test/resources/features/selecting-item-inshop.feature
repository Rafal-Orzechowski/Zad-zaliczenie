@Test2
Feature: Selecting item in shop

  Scenario: User is logged in and in shop page
    Given an open browser with Mystore page
    When Sign in button is clicked
    And login is yondwqrjrekwawfuil@sdvft.com
    And Password is Haslotest
    And Submit button is clicked
    And User click main page button
    And User select Hummingbird Printed Sweater in shop
#    And Discount is 20%
   And User select M size
    And User select 5 pices
    And Add items into the basket
    And User proceeds to checkout
    And Users confirms address
    And User confirms shipping method
    And User confirms payment
    And User agree to terms of service
    And User confirms order
   Then Screenshoot is taken.