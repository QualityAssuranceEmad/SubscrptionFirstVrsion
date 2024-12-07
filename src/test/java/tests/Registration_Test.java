package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.User_Registration_Page;

import java.util.concurrent.TimeUnit;

public class Registration_Test extends Test_Base{

    User_Registration_Page register_object;
    @Test
    public void User_Can_Register() throws InterruptedException {
        register_object=new User_Registration_Page(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        register_object.RegistrationButton();
        register_object.ClickOnSignUpPage("Mohamed","Ahmed","f46f386a61@emailfoxi.pro","01062365236","Emad2020@@","Emad2020@@");
        Thread.sleep(4000);
    }
}
