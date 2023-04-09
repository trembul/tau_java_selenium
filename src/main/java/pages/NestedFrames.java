package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrames {

    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String topFrame = "frame-top";
    private String bottomFrame = "frame-bottom";
    private By frameText = By.tagName("body");
    public NestedFrames(WebDriver driver) {
        this.driver=driver;
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(frameText).getText();
    }
}
