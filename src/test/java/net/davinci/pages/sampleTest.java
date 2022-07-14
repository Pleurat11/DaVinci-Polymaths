package net.davinci.pages;

import net.davinci.step_defs.googleSignInPage;
import net.davinci.utilities.BrowserUtils;
import net.davinci.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class sampleTest {

    @Test
    public void test(){
        Driver.getDriver().get("https://davinci-uat.polymathlabs.net/");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

        googleSignInPage stepDefsPage = new googleSignInPage();

        wait.until(ExpectedConditions.elementToBeClickable(stepDefsPage.signInBttn));
        stepDefsPage.signInBttn.click();



        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys("pleurat@polymaths.co" + Keys.ENTER);

        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("Pleurati1@3$" + Keys.ENTER);



    }
}
