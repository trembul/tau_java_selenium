package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultText(),
                "You successfully clicked an alert", "Incorrect alert");
    }
}
