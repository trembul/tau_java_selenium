package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        var example1Page = homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("http://www.google.com");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");


    }
}
