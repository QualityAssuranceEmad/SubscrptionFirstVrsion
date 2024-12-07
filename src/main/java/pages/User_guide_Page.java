package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_guide_Page extends Page_Base{

    public User_guide_Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[15]/div/a/span[2]")
    WebElement click_on_user_guide;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[1]/p-carousel/div/div/div/div/div/div[5]/div/div/div[2]/p-button/button")
    WebElement play_a_video;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div[1]/div/button")
    WebElement close_video;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[1]/p-carousel/div/div/div/button[2]")
    WebElement click_right_arrow;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[1]/p-carousel/div/div/div/button[1]")
    WebElement click_left_arrow;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[2]/p-carousel/div/div/div/div/div/div[4]/div/div/p-button/button")
    WebElement read_an_article;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div[1]/div/button")
    WebElement close_article;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[2]/p-carousel/div/div/div/button[2]")
    WebElement click_right_arrow1;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-user-guide/div/div[2]/div[2]/p-carousel/div/div/div/button[1]")
    WebElement click_left_arrow1;

    public void click_on_user_guide_page()
    {
        clickMeButton(click_on_user_guide);
    }
    public void click_on_user_guide_page_and_play_a_video() throws InterruptedException {

        clickMeButton(click_right_arrow);
        Thread.sleep(1000);
        clickMeButton(click_left_arrow);
        Thread.sleep(2000);
        clickMeButton(play_a_video);
        Thread.sleep(3000);
        clickMeButton(close_video);

    }
    public void click_on_user_guide_page_and_read_article() throws InterruptedException {

        clickMeButton(click_right_arrow1);
        Thread.sleep(1000);
        clickMeButton(click_left_arrow1);
        Thread.sleep(2000);
        clickMeButton(read_an_article);
        Thread.sleep(3000);
        clickMeButton(close_article);
    }
}

