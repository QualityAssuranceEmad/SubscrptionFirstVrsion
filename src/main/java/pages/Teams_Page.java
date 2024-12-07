package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Teams_Page extends Page_Base {
    public Teams_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[7]/div/a")
    WebElement click_on_team_button;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-teams/div/div[1]/div[2]/p-button[2]/button")
    WebElement click_on_create_team;

    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/input")
    WebElement add_title;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/p-dropdown/div/span")
    WebElement click_on_select_plan;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[1]/li/span[1]")
    WebElement select_first_plan;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li/span[1]")
    WebElement select_second_plan;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[3]/li/span[1]")
    WebElement select_third_plan;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[4]/li/span[1]")
    WebElement select_fourth_plan;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[2]/textarea")
    WebElement add_description;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-team/div/div[3]/p-button/button/span[1]")
    WebElement click_create;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-teams/div/div[1]/div[2]/p-button[2]/button")
    WebElement click_on_add_member;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[2]/p-dropdown[1]/div/span")
    WebElement click_chose_team_list;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[2]/p-dropdown[1]/div/p-overlay/div/div/div/div/ul/p-dropdownitem[1]/li/span[1]")
    WebElement select_first_team;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[2]/p-dropdown[1]/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li/span[1]")
    WebElement select_second_team;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[2]/p-dropdown[2]/div/span")
    WebElement click_chose_role_list;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[2]/p-chips/div/ul/li/input")
    WebElement add_email;
    @FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div/app-add-member/div/div[3]/p-button/button/span[1]")
    WebElement click_chose_create_member;

    public void click_on_team_page() {
        clickMeButton(click_on_team_button);
    }

    public void creating_team(String title, String description) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        clickMeButton(click_on_create_team);
        sendText(add_title, title);
        clickMeButton(click_on_select_plan);
        Thread.sleep(6000);
        clickMeButton(select_first_plan);
        sendText(add_description, description);
        clickMeButton(click_create);

    }

    public void creating_team_member(String member_emails) throws InterruptedException {
        clickMeButton(click_on_add_member);
        clickMeButton(click_chose_team_list);
        clickMeButton(select_first_team);
        clickMeButton(click_chose_role_list);
        //add team rle here
        Thread.sleep(6000);

        sendText(add_email, member_emails);
        clickMeButton(click_chose_create_member);

    }


}
