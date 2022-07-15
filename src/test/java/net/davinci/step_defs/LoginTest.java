package net.davinci.step_defs;

import net.davinci.pages.SignInPage;
import org.testng.annotations.Test;

public class LoginTest {
    SignInPage signInPage = new SignInPage();

    @Test
    public void testLogin(){
        signInPage.davinciLogin();
    }
    
}
