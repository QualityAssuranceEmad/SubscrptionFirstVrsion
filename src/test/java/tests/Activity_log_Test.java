package tests;

import org.testng.annotations.Test;
import pages.Activity_log_page;
import pages.Login_Page;

import java.util.concurrent.TimeUnit;

public class Activity_log_Test extends Test_Base{
    Activity_log_page activity_log_object;
    Login_Page login_object;
    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }
    @Test(priority = 2)
    public void  test_activity_log_page() throws InterruptedException {
        activity_log_object=new Activity_log_page(driver);
        activity_log_object.click_on_activity_log();
    }
}
