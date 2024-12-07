package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class User_Registration_Page extends Page_Base {
    public User_Registration_Page(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[1]/div/ul/li[2]/a/div")
    WebElement registerButton;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-registration-form/div/form/div[1]/span/input")
    WebElement firstName;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-registration-form/div/form/div[2]/span/input")
    WebElement lastName;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "password1")
    WebElement password;
    @FindBy(id = "password2")
    WebElement confirm_password;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-registration-form/div/form/div[7]/span")
    WebElement terms;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-registration-form/p-confirmdialog/div/div/div[3]/button[2]/span[1]")
    WebElement clickYes;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[2]/p-scrollpanel/div/div[1]/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-registration-form/div/form/div[8]/p-button/button")
    WebElement clickSubmit;

    public void RegistrationButton() throws InterruptedException {
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement register = wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        Thread.sleep(4000);
        clickMeButton(registerButton);
    }

    public void ClickOnSignUpPage(String F_name, String L_name, String Email, String Phone, String Password, String Confirm_password) throws InterruptedException {


        sendText(firstName, F_name);
        sendText(lastName, L_name);
        sendText(email, Email);
        sendText(phone, Phone);
        sendText(password, Password);
        sendText(confirm_password, Confirm_password);
        clickMeButton(terms);
        Thread.sleep(2000);
        clickMeButton(clickYes);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement Submit_button = wait.until(ExpectedConditions.elementToBeClickable(clickSubmit));
        clickMeButton(Submit_button);


    }

}
