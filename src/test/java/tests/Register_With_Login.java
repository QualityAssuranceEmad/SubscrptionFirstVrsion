package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_Page;
import pages.User_Registration_Page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Register_With_Login extends Test_Base {
    User_Registration_Page register_object;
    Login_Page login_object;

    @Test
    public void Test_Register_With_Login() throws InterruptedException {
        register_object = new User_Registration_Page(driver);
        register_object.RegistrationButton();
        register_object.ClickOnSignUpPage("omr", "josef", "zfshqboktddlfdynyw@ytnhy.com", "01065025236", "Emad2020@@", "Emad2020@@");
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("zfshqboktddlfdynyw@ytnhy.com", "Emad2020@@");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// Use explicit wait to wait until the element contains the expected text
        WebElement Assert_Advintic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-app-layout/div/app-header/div/a/span")));
// Use an assertion to verify the text contains "Advintic"
        Assert.assertTrue(Assert_Advintic.getText().contains("Advintic"), "Text does not contain 'Advintic'");
// Print the text of the element
        System.out.println(Assert_Advintic.getText());
    }

}
