package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Profile_Page extends Page_Base {
    public Profile_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[3]/div/a/span[2]")
    WebElement profile_Button;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/div/span[2]")
    WebElement click_edit_button;
    //
    @FindBy(css = "div[_ngcontent-ng-c61769580=''] input[type='file']")
    public WebElement click_image;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[1]/div/input")
    WebElement first_name;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[2]/div/input")
    WebElement last_name;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[5]/div/input")
    WebElement institution;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[6]/div/input")
    WebElement jop_title;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[7]/div/ngx-intl-tel-input/div/input")
    WebElement phone;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[8]/div/input")
    WebElement country;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[9]/div/input")
    WebElement city;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[10]/div/input")
    WebElement postal_code;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[3]/form/div[1]/div/p-password/div/input")
    WebElement current_Password;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[3]/form/div[2]/div/p-password/div/input")
    WebElement new_Password;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[3]/form/div[3]/div/p-password/div/input")
    WebElement confirm_Password;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[3]/form/div[4]/p-button/button")
    WebElement click_change_pass;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/p-confirmdialog/div/div/div[3]/button[2]/checkicon")
    public WebElement click_Yes_for_change_pass;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/div/div[2]/form/div[11]/p-button/button")
    public WebElement click_save;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-profile/p-confirmdialog/div/div/div[3]/button[2]/span[1]")
    public WebElement click_Yes;

    public void Click_on_profile_button() {
        clickMeButton(profile_Button);
    }

    public void Click_on_edit_profile() {
        clickMeButton(click_edit_button);

    }

    public void Click_on_edit_image(String image) throws InterruptedException {
        Thread.sleep(3000);
        sendText(click_image, image);
        Thread.sleep(2000);
        //  clickMeButton(click_save);
        // Thread.sleep(3000);
        //  clickMeButton(click_Yes);
    }

    public void Click_on_edit_profile_and_edit(String F_name, String L_name, String Institution, String Jop_title, String Phone, String Country, String City, String Postal_code) {
        first_name.clear();
        sendText(first_name, F_name);
        last_name.clear();
        sendText(last_name, L_name);
        institution.clear();
        sendText(institution, Institution);
        jop_title.clear();
        sendText(jop_title, Jop_title);
        phone.clear();
        sendText(phone, Phone);
        country.clear();
        sendText(country, Country);
        city.clear();
        sendText(city, City);
        postal_code.clear();
        sendText(postal_code, Postal_code);
        clickMeButton(click_save);
        clickMeButton(click_Yes);

    }

    public void Click_on_edit_profile_and_Change_Pass(String current_Pass, String new_pass, String confirm_pass) {
        sendText(current_Password, current_Pass);
        sendText(new_Password, new_pass);
        sendText(confirm_Password, confirm_pass);
        clickMeButton(click_change_pass);
        clickMeButton(click_Yes_for_change_pass);

    }
}
