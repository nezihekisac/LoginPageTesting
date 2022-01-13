package com.hudl.stepDefinitions;
import com.hudl.pages.DashboardPage;
import com.hudl.pages.LoginPage;
import com.hudl.utilities.BrowserUtils;
import com.hudl.utilities.ConfigurationReader;
import com.hudl.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;


public class MyStepdefs {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user on the dashboard and The user clicks on the login button")
    public void theUserOnTheDashboardAndTheUserClicksOnTheLoginButton() {
        String url=ConfigurationReader.get("url");
        Driver.get().get(url);
       // BrowserUtils.waitFor(1);
        dashboardPage.DashboardLogin.click();
       // BrowserUtils.waitFor(1);
    }






    @When("the user should land on the login page")
    public void theUserShouldLandOnTheLoginPage() {
        BrowserUtils.waitFor(1);
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Log In - Hudl",actualTitle);
    }
    @And("the user clicks Remember me checkbox")
    public void theUserClicksRememberMeCheckbox() {
        loginPage.rememberMe.click();
    }

    @Then("Remember me checkbox should be selected")
    public void rememberMeCheckboxShouldBeSelected() {
       // BrowserUtils.waitFor(1);
        Assert.assertTrue(loginPage.checkbox.isSelected());
    }


    @When("user enters with the valid credentials {string} and {string}")
    public void userEntersWithTheValidCredentialsAnd(String email, String password) {
        loginPage.email.sendKeys(ConfigurationReader.get("Email"));
       // BrowserUtils.waitFor(1);
        loginPage.password.sendKeys(ConfigurationReader.get("Password"));
       // BrowserUtils.waitFor(1);

    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.logIn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should be able to land home page")
    public void userShouldBeAbleToLandHomePage() {
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("Home - Hudl",actualTitle);
    }


    @When("the user logs in using following credentials {string} and {string}")
    public void theUserLogsInUsingFollowingCredentialsAnd(String email,String password ) {
        loginPage.login(email,password);

    }


    @Then("the following message should be displayed")
    public void theFollowingShouldBeDisplayed() {
        BrowserUtils.waitForVisibility(loginPage.errormessage,3);
        Assert.assertTrue(loginPage.errormessage.isDisplayed());

    }

    @When("the user clicks on the Need help? link in the message")
    public void theUserClicksOnTheNeedHelpLinkNextToTheMessage() {
        loginPage.needHelp1.click();
    }

    @Then("the user should see the Login Help section")
    public void theUserShouldSeeTheLoginHelpSection() {
        BrowserUtils.waitForVisibility(loginPage.loginhelp,2);
        Assert.assertTrue(loginPage.loginhelp.isDisplayed());
    }

    @When("the user enters valid {string}")
    public void theUserEntersValid(String email) {
        loginPage.resetemailbox.sendKeys(ConfigurationReader.get("Email"));
    }

    @Then("the Send password Reset button should be clickable")
    public void theSendPasswordResetButtonShouldBeClickable() {
        Assert.assertTrue(loginPage.sendpasswordresetButton.isEnabled());
    }

    @When("the user enters invalid {string}")
    public void theUserEntersInvalid(String wrongemail ) {
        loginPage.resetemailbox.clear();
        loginPage.resetemailbox.sendKeys(wrongemail);
        BrowserUtils.waitFor(2);
        loginPage.sendpasswordresetButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the invalid email error message should be displayed")
    public void theInvalidEmailErrorMessageShouldBeDisplayed() {
        Assert.assertTrue(loginPage.resetemailError.isEnabled());
    }

    @When("the user does not enter any email")
    public void theUserDoesNotEnterAnyEmail() {
        loginPage.resetemailbox.clear();
    }

    @Then("Send Password Reset button should not be displayed")
    public void sendPasswordResetButtonShouldNotBeDisplayed() {
        Assert.assertTrue(loginPage.sendpasswordresetButton.isEnabled());
    }

    @When("the user enters {string}")
    public void theUserEnters(String someNumbers) {
        loginPage.resetemailbox.sendKeys(someNumbers);
        BrowserUtils.waitFor(3);
        loginPage.sendpasswordresetButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Check email error should be displayed")
    public void checkEmailErrorShouldBeDisplayed() {
        Assert.assertTrue(loginPage.checkEmailError.isEnabled());
    }

    @When("the user clicks the Back button")
    public void theUserCkicksTheBackButton() {
        Assert.assertTrue(loginPage.backButton.isDisplayed());
        loginPage.backButton.click();
    }

    @Then("the user should be able to see login section again")
    public void theUserShouldBeAbleToSeeLoginSectionAgain() {
        Assert.assertTrue(loginPage.afterBackBLoginSection.isEnabled());
        BrowserUtils.waitFor(2);
    }

    @When("the user enters the same number twice")
    public void theUserEntersTheSameTwice() {
        loginPage.needHelp1.click();
        loginPage.sendpasswordresetButton.click();
    }

    @Then("the email check error should be displayed")
    public void theEmailCheckErrorShouldBeDisplayed() {
        Assert.assertTrue(loginPage.checkEmailError.isEnabled());
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks the back button")
    public void theUserClicksTheBackButton() {
        loginPage.backButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to see login section")
    public void theUserShouldBeAbleToSeeLoginSection() {
        Assert.assertTrue(loginPage.afterBackBLoginSection.isDisplayed());
    }
}
