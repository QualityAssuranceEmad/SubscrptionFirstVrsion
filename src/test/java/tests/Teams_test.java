package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_Page;
import pages.Teams_Page;

import java.util.concurrent.TimeUnit;

public class Teams_test extends Test_Base{
    Teams_Page team_object;
    Login_Page login_object;
    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro","Emad2020###");

    }
    @Test(priority = 2)
    public void creating_teams_and_add_members() throws InterruptedException {
        team_object=new Teams_Page(driver);
        team_object.click_on_team_page();
        team_object.creating_team("team01","dddddddddddddddddddd");
    }
}
