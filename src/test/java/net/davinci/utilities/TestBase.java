package net.davinci.utilities;

import net.davinci.pages.SignInPage;
import org.testng.annotations.BeforeTest;

public class TestBase {
    SignInPage signInPage = new SignInPage();
    @BeforeTest
    public void setUp(){
        signInPage.davinciLogin();
    }
}
