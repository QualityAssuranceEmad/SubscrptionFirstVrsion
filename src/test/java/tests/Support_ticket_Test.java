package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_Page;
import pages.Support_ticket_page;

import java.util.concurrent.TimeUnit;

public class Support_ticket_Test extends Test_Base{
    Login_Page login_object;
    Support_ticket_page support_ticket_object;

    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro","Emad2020###");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Assert_Advintic=driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div/app-header/div/a/span"));
        Assert.assertTrue(Assert_Advintic.getText().contains("Advintic"));
        System.out.println(Assert_Advintic.getText());
    }
    @Test(priority = 2)
    public void TestSendigSupportTicket() throws InterruptedException {
        support_ticket_object=new Support_ticket_page(driver);
        support_ticket_object.clicking_support_ticket();
        support_ticket_object.sending_ticket("Problem in network","help me please");
        Thread.sleep(6000);
    }
    @Test(priority = 3)
    public void chating_with_admin() throws InterruptedException {
        support_ticket_object.sending_message_to_admin("help");
    }
}
