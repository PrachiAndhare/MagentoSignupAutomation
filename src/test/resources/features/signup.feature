Feature: Magento Sign Up and Login

  Scenario: Successful Sign Up and Login
    Given User is on Magento home page
    When User clicks on Create an Account
    And User enters valid details and submits
    Then User should be registered and redirected to My Account
    When User navigates to Sign In page
    And User logs in with the registered credentials
    Then User should be logged in and see the My Account page
