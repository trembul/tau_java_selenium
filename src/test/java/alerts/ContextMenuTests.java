package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testGetTextFromAlert(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickBox();
        String alertText = contextMenuPage.getAlertText();
        contextMenuPage.clickToConfirm();
        assertEquals(alertText, "You selected a context menu", "Incorrect alert text");
    }
}
