package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billing_Plans_page extends Page_Base{
    public Billing_Plans_page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[9]/div/a")
    WebElement click_on_Billings;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-billing-payment/div/div[2]/div/app-billing-payment-item/div[1]/div/div[1]/p-button/button/span[1]")
    WebElement click_on_plan_details;

}
