package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_As_Guist_Page extends Page_Base{
    public Register_As_Guist_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/a/img")
    WebElement click_on_landing_page;
    // check image bar in the top of landing page;
    @FindBy(xpath = "/html/body/app-root/app-landing/div[2]/div/p-galleria/p-galleriacontent/div/div/p-galleriaitem/div/ul/li[1]/button")
    WebElement click_first_image_bar;
    @FindBy(xpath = "/html/body/app-root/app-landing/div[2]/div/p-galleria/p-galleriacontent/div/div/p-galleriaitem/div/ul/li[2]/button")
    WebElement click_second_image_bar;
    @FindBy(xpath = "/html/body/app-root/app-landing/div[2]/div/p-galleria/p-galleriacontent/div/div/p-galleriaitem/div/ul/li[3]/button")
    WebElement click_third_image_bar;
    @FindBy(xpath = "/html/body/app-root/app-landing/div[2]/div/p-galleria/p-galleriacontent/div/div/p-galleriaitem/div/ul/li[4]/button")
    WebElement click_fourth_image_bar;
    @FindBy(xpath = "/html/body/app-root/app-landing/div[2]/div/p-galleria/p-galleriacontent/div/div/p-galleriaitem/div/div/div/p-galleriaitemslot/a/img")
    WebElement click_on_image_No_4;
    public void click_on_landing_page()
    {
        clickMeButton(click_on_landing_page);
    }
    public void click_on_image_bar_and_check_it_transfer_to_SignUp_page() throws InterruptedException {
        clickMeButton(click_first_image_bar);
        Thread.sleep(1000);
        clickMeButton(click_second_image_bar);
        Thread.sleep(1000);
        clickMeButton(click_third_image_bar);
        Thread.sleep(1000);
        clickMeButton(click_fourth_image_bar);
        Thread.sleep(2000);
        clickMeButton(click_on_image_No_4);

    }
}
