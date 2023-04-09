package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwyg();
        editorPage.clearEditArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.sendText(text1);
        editorPage.increaseIndention();
        editorPage.sendText(text2);
        assertEquals(editorPage.getTextFromIframe(), text1 + text2, "Incorrect text");
    }

    @Test
    public void testFramesText(){
        var nestedPage = homePage.clickFrames().clickNestedFrames();
        String leftFrameText = nestedPage.getLeftFrameText();
        String bottomFrameText = nestedPage.getBottomFrameText();
        assertEquals(leftFrameText, "LEFT", "Incorrect frame text");
        assertEquals(bottomFrameText, "BOTTOM", "Incorrect frame text");
    }
}
