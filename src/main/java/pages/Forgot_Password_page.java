package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Forgot_Password_page extends Page_Base {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));;
    public Forgot_Password_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-login-form/div/form/div[4]/span")
    WebElement forgot_Password;
    @FindBy(xpath = "/html/body/app-root/app-forgot-password/div/form/span[2]/input")
    WebElement email;
    @FindBy(xpath = "/html/body/app-root/app-forgot-password/div/form/p-button/button/span[1]")
    WebElement click_on_Reset_password;

    public void click_on_Forgot_Password() throws InterruptedException {
        // String currentWindowId=driver.getWindowHandle();
        Thread.sleep(4000);
        clickMeButton(forgot_Password);
       /* wait.until(ExpectedConditions.elementToBeClickable(forgot_Password));
        clickMeButton(forgot_Password);
*/
    }
    public void add_Email_Check(String Email) {
        // String currentWindowId=driver.getWindowHandle();
       // sendText(email,Email);
        //clickMeButton(click_on_Reset_password);
        wait.until(ExpectedConditions.visibilityOf(email));
        sendText(email, Email);

        // Wait until the reset password button is clickable, then click
        wait.until(ExpectedConditions.elementToBeClickable(click_on_Reset_password));
        clickMeButton(click_on_Reset_password);
    }
}
