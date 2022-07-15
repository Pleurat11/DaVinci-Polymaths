package net.davinci.pages;

import net.davinci.utilities.BrowserUtils;
import net.davinci.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[.='Surveys'])[1]")
    public WebElement surveysTab;

    @FindBy(xpath = "(//a[.='Surveys'])[2]")
    public WebElement surveysModule;

    @FindBy(xpath = "(//input[@type='date'])[1]")
    public WebElement fromDate;

    public void goToSurveys(){
        surveysTab.click();
        BrowserUtils.sleep(1);
        surveysModule.click();

        BrowserUtils.sleep(2);

        fromDate.clear();

        fromDate.sendKeys("02022020");
    }

}
