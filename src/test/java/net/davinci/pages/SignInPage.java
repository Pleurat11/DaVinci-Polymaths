package net.davinci.pages;

import net.davinci.utilities.BrowserUtils;
import net.davinci.utilities.ConfigurationReader;
import net.davinci.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

    @FindBy(xpath = "(//*[@name='googleSignUpButton']//*[.='Continue with Google'])[2]")
    public WebElement continueWithGoogleBttn;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordField;


    public void davinciLogin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        try {

            continueWithGoogleBttn.click();

            wait.until(ExpectedConditions.visibilityOf(emailField));
            emailField.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);

            wait.until(ExpectedConditions.visibilityOf(passwordField));
            passwordField.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);


            wait.until(ExpectedConditions.titleContains("DaVinci"));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
