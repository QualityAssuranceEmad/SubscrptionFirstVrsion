package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Track_invoices_page extends Page_Base {
    public Track_invoices_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[5]/div/a/span[2]")
    WebElement click_track_Invoices_button;
    @FindBy(xpath = " /html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-invoices-list/div/div/div/div[1]/div/p-button[1]/button")
    WebElement download_invoice;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-invoices-list/div/div/div/div[1]/div/p-button[2]/button")
    WebElement delete_invoice;

    public void click_on_track_invoices_page() {
        clickMeButton(click_track_Invoices_button);
    }

    public void click_on_track_invoices_delete() {
        clickMeButton(delete_invoice);
    }

    public void click_on_track_invoices_download() {
        clickMeButton(download_invoice);
    }

}
