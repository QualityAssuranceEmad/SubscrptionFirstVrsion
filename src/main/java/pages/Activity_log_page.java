package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activity_log_page extends Page_Base {
    public Activity_log_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[11]/div/a")
    WebElement activity_log_button;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-activity-log/div/div/div[2]/app-time-line/div/p-scrollpanel/div/div[1]/div/p-timeline/div/div[11]/div[2]/small")
    WebElement click_2023_Year;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-activity-log/div/div/div[2]/app-time-line/div/p-scrollpanel/div/div[1]/div/p-timeline/div/div[10]/div[3]/div/small[12]")
    WebElement filter_by_month_December ;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-activity-log/div/div/div[2]/app-time-line/div/p-scrollpanel/div/div[1]/div/p-timeline/div/div[12]/div[3]/div/small[12]")
    WebElement filter_by_month_dec;
    public void click_on_activity_log() throws InterruptedException {
        clickMeButton(activity_log_button);
        Thread.sleep(2000);
        clickMeButton(click_2023_Year);
        Thread.sleep(2000);
        clickMeButton(filter_by_month_December);

    }
}
