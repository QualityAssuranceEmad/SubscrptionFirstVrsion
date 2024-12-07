package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQ_Page extends Page_Base{
    public FAQ_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[17]/div/a")
    WebElement click_on_faq_page;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-faq/div/p-accordion/div/p-accordiontab[1]/div/div[1]/a")
    WebElement click_on_arrow_and_read;
    public  void click_on_faq()
    {
        clickMeButton(click_on_faq_page);
    }
    public  void click_on_faq_and_read() throws InterruptedException {
        clickMeButton(click_on_arrow_and_read);
        Thread.sleep(2000);
        clickMeButton(click_on_arrow_and_read);
    }
}
