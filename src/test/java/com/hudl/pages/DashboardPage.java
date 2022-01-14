package com.hudl.pages;
import com.hudl.utilities.BrowserUtils;
import com.hudl.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class DashboardPage {

    @FindBy(css = "div>a.mainnav__btn.mainnav__btn--primary")
    public WebElement DashboardLogin;

    public DashboardPage() {
        PageFactory.initElements(Driver.get(), this);
    }

}


