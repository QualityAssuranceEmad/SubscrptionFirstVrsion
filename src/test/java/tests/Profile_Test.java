package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_Page;
import pages.Profile_Page;

import java.awt.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Profile_Test extends Test_Base {
    Profile_Page profile_Object;
    Login_Page login_object;

    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Profile_Editing() throws InterruptedException, AWTException {
        profile_Object = new Profile_Page(driver);
        profile_Object.Click_on_profile_button();
        profile_Object.Click_on_edit_profile();
        Thread.sleep(3000);
        String imageName = "mo.jpeg";
        String imagePath = "D:\\Advintic Project\\Automation_Tasks\\new project\\Full_Test_For_Subscrption.V\\Uploades\\mo.jpg";
        profile_Object.Click_on_edit_image(imagePath);
        Thread.sleep(4000);
         profile_Object.Click_on_edit_profile_and_edit("mohammed", "Emad", "Advanic", "QA", "01095826325", "Egypt", "Sohag", "31511");
        Thread.sleep(8000);

    }
    @Test(priority = 3)
    public void Profile_Change_Password() throws InterruptedException, AWTException {
        profile_Object = new Profile_Page(driver);
        Thread.sleep(6000);
        profile_Object.Click_on_edit_profile();
        Thread.sleep(3000);
        profile_Object.Click_on_edit_profile_and_Change_Pass("Emad2020##","Emad2020###","Emad2020###");

    }
}
