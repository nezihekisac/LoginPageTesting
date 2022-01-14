package com.hudl.pages;
import com.hudl.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DashboardPage {


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "input[name='username']")
    public WebElement email;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "button[id='logIn']")
    public WebElement logIn;

    @FindBy(css = "div[class='login-organization-button']")
    public WebElement loginWithOrganizationButton;

    @FindBy(css= "label[for='remember-me']")
    public WebElement rememberMe;

    @FindBy(css = "div.login-error-container")
    public WebElement errormessage;

    @FindBy(css = "p>a[href='#']")
    public WebElement needHelp1;

    @FindBy(css = "form[class='reset-container']>div[class='reset-info']")
    public WebElement loginhelp;

    @FindBy(css = "div[class='login-reset email-instructions']")
    public WebElement sendpasswordresetButton;

    @FindBy(id = "forgot-email")
    public WebElement resetemailbox;

    @FindBy(css = "div[class='reset-error-container']")
    public WebElement resetemailError;

    @FindBy(css = "form[class='login-container']")
    public WebElement afterBackBLoginSection;

    @FindBy(xpath = "(//div[@class='reset-info'])[2]")
    public WebElement afterNeedHelp1;

    @FindBy(xpath = "(//div[@class='reset-info'])[1]")
    public WebElement afterNeedHelp2;

    @FindBy(id = "back-to-login")
    public WebElement backButton;

    @FindBy(id = "forgot-password-link")
    public WebElement needHelp2;

    @FindBy(css = "#remember-me")
    public WebElement checkbox;

    @FindBy(css = "div[class='uni-bg--level0 uni-padding--one']")
    public WebElement afterLoginOrganization;

    @FindBy(id = "uniId_1")
    public WebElement OrganizationEmailBox;

    @FindBy(xpath = "//*[text()='Log In']")
    public WebElement OrganizationMailLoginButton;

    @FindBy(css = "div[class='login-error-container-code']")
    public WebElement cantloginError;

    public void login(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        logIn.click();

    }
}
