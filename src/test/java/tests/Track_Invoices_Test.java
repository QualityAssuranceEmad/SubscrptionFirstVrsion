package tests;

import org.testng.annotations.Test;
import pages.Login_Page;
import pages.Track_invoices_page;

import java.util.concurrent.TimeUnit;

public class Track_Invoices_Test extends Test_Base{
    Track_invoices_page track_invoice_object;
    Login_Page login_object;

    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }

    public  void Dealing_with_track_invoices()
    {
        track_invoice_object=new Track_invoices_page(driver);
        track_invoice_object.click_on_track_invoices_page();

    }
}
