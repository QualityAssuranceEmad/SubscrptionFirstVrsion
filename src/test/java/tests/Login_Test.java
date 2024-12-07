package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_Page;

import java.util.concurrent.TimeUnit;

public class Login_Test extends Test_Base{
    Login_Page login_object;
    @Test
    public void TestLoginToSubscription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login_object = new Login_Page(driver);
        login_object.Login_To_Subscription("27a85c84ea@emailfoxi.pro","Emad2020###");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Assert_Advintic=driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div/app-header/div/a/span"));
        Assert.assertTrue(Assert_Advintic.getText().contains("Advintic"));
        System.out.println(Assert_Advintic.getText());
    }
}
