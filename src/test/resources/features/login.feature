@login
Feature: Login


  Background:
    Given the user on the dashboard and The user clicks on the login button

    @test1
  Scenario: Verifying Remember me checkbox is selected
    When the user should land on the login page
    And the user clicks Remember me checkbox
    Then Remember me checkbox should be selected

      @test2
  Scenario: Login with the credentials
    When user enters with the valid credentials "Email" and "Password"
    And user clicks login button
    Then user should be able to land home page

   @test3
  Scenario Outline: Login functions with invalid info for different users and reset password,errors and back link
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
    When the user clicks the Back link
    Then the user should be able to see login section again
    When the user enters the same number twice
    Then the email check error should be displayed
    When the user clicks the back link
    Then the user should be able to see login section
    Examples:
      | emails             | passwords | wrongEmail        | someNumbers |
      | wrongemail         | wrong     | dhdh@gm.com       | 3           |
      | nezkisac@gmail.com | wrong     | sd                | 123         |
      | wrong              | Eyey357.  | a jj@gmail.com    | 1           |
      |                    |           | d@                | 19          |
      |                    | Eyey357   | nezkisac@gmail    | 12          |
      | nezkisac@gmail.com |           | nezkisac@gmailcom | 1234        |
      | 12233              | !@??  +    | nezkisacgmail.com | 3           |

 @test4
  Scenario:clicking Need help? link below the login button
    When the user clicks the Need help ? link under the login button
    Then the user should be able to see login help section

   @test5
  Scenario:Login with Organization
    When the user clicks on the Log in with an Organization button
    Then the user should be able to see login email with organization section
    When the user enters with valid "Email" which is not for organization
    Then error message should be displayed












