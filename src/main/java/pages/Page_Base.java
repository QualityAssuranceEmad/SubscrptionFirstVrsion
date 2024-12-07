package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_Base {
    public JavascriptExecutor jse ;
    protected WebDriver driver;

    public Page_Base(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickMeButton(WebElement button) {
        button.click();
    }

    protected static void sendText(WebElement textElement, String value) {
        textElement.sendKeys(value);
    }
    public void scrollToBottom()

    {
        jse.executeScript("scrollBy(0,25000)");
    }

}
