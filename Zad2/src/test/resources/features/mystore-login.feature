@Test
Feature: My store account login

  Scenario: User login to account
    Given an open browser with Mystore page
    When Sign in button is clicked
    And login is yondwqrjrekwawfuil@sdvft.com
    And Password is Haslotest
    Then Submit button is clicked
    And User click main page button