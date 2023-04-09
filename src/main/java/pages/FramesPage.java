package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver=driver;
    }

    public NestedFrames clickNestedFrames(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFrames(driver);
    }
}
