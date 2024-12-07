package tests;

import org.testng.annotations.Test;
import pages.Forgot_Password_page;

public class Forgot_Password_Test extends Test_Base{
    Forgot_Password_page forget_object;
    @Test
    public void ClickOnForgetPassword() throws InterruptedException {
        Thread.sleep(2000);
        forget_object =new Forgot_Password_page(driver);
        forget_object.click_on_Forgot_Password();
        forget_object.add_Email_Check("27a85c84ea@emailfoxi.pro");
    }
}
