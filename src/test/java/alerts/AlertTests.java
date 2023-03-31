package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(),
                "You successfully clicked an alert", "Incorrect alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.alert_getAlertText();
        javaScriptAlertsPage.alert_clickToCancel();
        assertEquals(text, "I am a JS Confirm", "Incorrect alert text");
    }

    @Test
    public void testSetInputInAlert(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerPrompt();
        String text = "Jarek";
        javaScriptAlertsPage.alert_setInput(text);
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(), "You entered: " + text, "Incorrect text");
    }
}
