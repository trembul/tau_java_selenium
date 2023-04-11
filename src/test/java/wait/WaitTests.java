package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStartButton();
        String text = dynamicLoadingPage.getLoadedText();
        assertEquals(text, "Hello World!", "Text not visible");
    }
}
