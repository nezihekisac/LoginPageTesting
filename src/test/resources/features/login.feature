@login
Feature: Login


  Background:
    Given the user on the dashboard and The user clicks on the login button

  Scenario: Verifying Remember me checkbox is selected
    When the user should land on the login page
    And the user clicks Remember me checkbox
    Then Remember me checkbox should be selected

  Scenario: Login with the credentials
    When user enters with the valid credentials "Email" and "Password"
    And user clicks login button
    Then user should be able to land home page


  Scenario Outline: Login functions with invalid info for different users
    When the user logs in using following credentials "<emails>" and "<passwords>"
    Then the following message should be displayed
    When the user clicks on the Need help? link in the message
    Then the user should see the Login Help section
    When the user enters valid "email"
    Then the Send password Reset button should be clickable
    When the user enters invalid "<wrongEmail>"
    Then the invalid email error message should be displayed
    When the user does not enter any email
    Then Send Password Reset button should not be displayed
    When the user enters "<someNumbers>"
    Then Check email error should be displayed
    When the user ckicks the Back button
    Then the Back button should be
    Examples:
      | emails             | passwords | wrongEmail        | someNumbers |
      | wrongemail         | wrong     | dhdh@gm.com       | 3           |
      | nezkisac@gmail.com | wrong     | sd                | 3           |
      | wrong              | Eyey357.  | a jj@gmail.com    | 1           |
      |                    |           | d@                | 9           |
      |                    | Eyey357   | nezkisac@gmail    | 3           |
      | nezkisac@gmail.com |           | nezkisac@gmailcom | 9           |
      | 12233              | !@£  +    | nezkisacgmail.com | 1           |





