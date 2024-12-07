package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_Page extends Page_Base{
    public Login_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-login-form/div/form/div[1]/span/input")
    WebElement email_login;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-login-form/div/form/div[2]/span/input")
    WebElement password_login;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-login-form/div/form/div[3]/p-checkbox/div/div[2]")
    WebElement Remember_me;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-login-form/div/form/div[5]/p-button/button")
    WebElement click_login;
    public void Login_To_Subscription(String Email,String Password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(email_login));
        sendText(button1,Email);
        WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(password_login));
        sendText(button2,Password);
        Thread.sleep(2000);
        clickMeButton(Remember_me);
        clickMeButton(click_login);
    }


}
