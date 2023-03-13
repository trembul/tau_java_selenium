package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void sliderCounterTest(){
        var sliderPage = homePage.clickHorizontalSlider();
        String value = "4";
        sliderPage.moveSlider(value);
        assertEquals(sliderPage.getCounter(), value, "Incorrect value" );
    }
}
