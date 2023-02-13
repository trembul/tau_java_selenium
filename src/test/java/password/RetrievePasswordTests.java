package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class RetrievePasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPasword();
        var emailSentPage = forgotPasswordPage.retrievePassword("anja@wp.pl");
        String error = emailSentPage.getErrorText();
        assertEquals(error, "Internal Server Error", "Incorrect error message");
    }
}
