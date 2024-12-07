package tests;

import org.testng.annotations.Test;
import pages.FAQ_Page;
import pages.Login_Page;

import java.util.concurrent.TimeUnit;

public class FAQ_Test extends Test_Base{
    Login_Page login_object;
FAQ_Page faq_object;
    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Test_FAQ() throws InterruptedException {
        faq_object=new FAQ_Page(driver);
        faq_object.click_on_faq();
        Thread.sleep(2000);
        faq_object.click_on_faq_and_read();
    }
}
