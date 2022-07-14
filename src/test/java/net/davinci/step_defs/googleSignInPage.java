package net.davinci.step_defs;

import net.davinci.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleSignInPage {
    public googleSignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "googleSignUpButton")
    public WebElement signInBttn;
}
