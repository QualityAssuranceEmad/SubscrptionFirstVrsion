package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Footer_links_page;
import pages.Login_Page;

public class Footer_links_Tes extends Test_Base {
    Login_Page login_object;
    Footer_links_page footer_links_object;
/*
    @Test(priority = 1)
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro", "Emad2020###");
        Thread.sleep(4000);
    }*/

    @Test(priority = 1)
    public void Test_Contact_us() throws InterruptedException {
        String currentWindowId = driver.getWindowHandle();
        footer_links_object = new Footer_links_page(driver);
        Thread.sleep(4000);
        footer_links_object.click_on_contact_us_page();
        footer_links_object.click_Terms_page();
        footer_links_object.click_reviw_page();
        footer_links_object.click_Faq_page();
        footer_links_object.click_on_facebook.click();
        footer_links_object.click_on_linkedin.click();
        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
            String url = driver.getCurrentUrl();
            if (url.equals("http://dev.advintic.com:9191/contact-us")) {
                Assert.assertEquals("http://dev.advintic.com:9191/contact-us", url);
                Thread.sleep(4000);
                footer_links_object.contact_admin_page("emad maher", "maaheremad681@gmail.com", "01035263526", "advantic", "The service you provide is excellent, but groups must be made available with the admin");

                //driver.close();
                break;
            } else if (url.equals("http://dev.advintic.com:9191/faq")) {
                Thread.sleep(4000);
                String faqHeading = driver.findElement(By.xpath("/html/body/app-root/app-faq/div/h2")).getText();
                Assert.assertTrue(faqHeading.contains("FAQs"), "The FAQ page heading does not contain 'FAQs'.");
                System.out.println("FAQ page is verified.");
                footer_links_object.make_some_action_on_faq_page();
            } else if (url.equals("http://dev.advintic.com:9191/terms-and-privacy")) {
                Thread.sleep(2000);
                String termsHeading = driver.findElement(By.xpath("/html/body/app-root/app-terms-and-privacy/div/div[2]/h2")).getText();
                Assert.assertTrue(termsHeading.contains("Terms & Conditions"), "The Terms page heading does not contain 'Terms & Conditions'.");
                System.out.println("Terms & Conditions page is verified.");
            }
            else if (url.equals("http://dev.advintic.com:9191/reviews"))
            {
                Thread.sleep(4000);
                footer_links_object.make_some_action_on_review_page();
                System.out.println("Review page action is performed.");
            }

            // driver.switchTo().window(currentWindowId);

        }

    }
}