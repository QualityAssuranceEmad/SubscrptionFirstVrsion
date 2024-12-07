package tests;

import org.testng.annotations.Test;
import pages.Login_Page;
import pages.User_guide_Page;

import java.util.concurrent.TimeUnit;

public class User_guide_Test extends Test_Base {
    Login_Page login_object;
    User_guide_Page user_guide_object;

    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Test_user_guide() throws InterruptedException {
        user_guide_object = new User_guide_Page(driver);
        user_guide_object.click_on_user_guide_page();
        Thread.sleep(4000);
        user_guide_object.click_on_user_guide_page_and_play_a_video();
        Thread.sleep(4000);
        user_guide_object.click_on_user_guide_page_and_read_article();
    }
}
