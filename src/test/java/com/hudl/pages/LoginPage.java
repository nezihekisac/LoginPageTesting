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

    @FindBy(id = "logInWithOrganization")
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

    @FindBy(css = "//h4[text()='Check Your Email']")
    public WebElement afterNumberEnter;


    @FindBy(id = "forgot-password-link")
    public WebElement needHelp2;

    @FindBy(css = "#remember-me")
    public WebElement checkbox;





    public void login(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        logIn.click();
        // verification that we logged
    }
}
