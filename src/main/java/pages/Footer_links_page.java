package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_links_page extends Page_Base {
    public Footer_links_page(WebDriver driver) {
        super(driver);
    }
    //contact us page

    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[1]/a[1]")
    WebElement click_on_contact_us_page;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[1]/span/input")
    WebElement add_name;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[2]/span/input")
    WebElement add_email;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[3]/ngx-intl-tel-input/div/input")
    WebElement add_phone;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[3]/ngx-intl-tel-input/div/div")
    WebElement click_on_phone_list;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[3]/ngx-intl-tel-input/div/div/div[2]/ul/li[66]")
    WebElement chose_egypt;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[4]/span/input")
    WebElement add_company;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/div[5]/span/textarea")
    WebElement add_message;
    @FindBy(xpath = "/html/body/app-root/app-contact-us/div[2]/div[1]/form/p-button/button")
    WebElement click_submit;
    //terms and privacy page
    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[1]/a[2]")
    WebElement click_on_terms_And_Privacy;
    @FindBy(xpath = "/html/body/app-root/app-terms-and-privacy/div/div[2]/h2")
    public WebElement assert_Terms_page;
    //Reviews page
    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[1]/a[3]")
    WebElement click_on_review;
    @FindBy(xpath = "/html/body/app-root/app-review-list/div[2]/p-dropdown/div/span")
    WebElement click_filter;
    @FindBy(xpath = "/html/body/app-root/app-review-list/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[1]/li/span[1]")
    WebElement click_filter_by_more_Recent;
    @FindBy(xpath = "/html/body/app-root/app-review-list/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li/span[1]")
    WebElement click_filter_by_oldest;
    @FindBy(xpath = "/html/body/app-root/app-review-list/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[3]/li/span[1]")
    WebElement click_filter_by_rating_low;
    @FindBy(xpath = "/html/body/app-root/app-review-list/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[4]/li/span[1]")
    WebElement click_filter_by_rating_high;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[2]/a[1]/i")
    public WebElement click_on_facebook;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[2]/a[1]/i")
    public WebElement click_on_linkedin;
    //FAQ page
    @FindBy(xpath = "/html/body/app-root/app-auth/div/app-footer/footer/div[1]/a[4]")
    public WebElement click_FAQ_page;
    @FindBy(xpath = "/html/body/app-root/app-faq/div/p-accordion/div/p-accordiontab[1]/div/div[1]/a")
    WebElement click_on_Faq_question;


    public void click_on_contact_us_page() throws InterruptedException {
        Thread.sleep(4000);
        clickMeButton(click_on_contact_us_page);
        // Replace "click_on_contact_us_page" with the actual element locator you are clicking on

    }

    public void contact_admin_page(String name, String email, String phone, String company, String message) throws InterruptedException {
        Thread.sleep(4000);
        sendText(add_name, name);
        sendText(add_email, email);
        clickMeButton(click_on_phone_list);
        Thread.sleep(2000);
        clickMeButton(chose_egypt);
        Thread.sleep(2000);
        sendText(add_phone, phone);
        sendText(add_company, company);
        sendText(add_message, message);
        clickMeButton(click_submit);
    }

    public void click_Terms_page() {
        clickMeButton(click_on_terms_And_Privacy);

    }

    public void click_reviw_page() throws InterruptedException {
        clickMeButton(click_on_review);

    }

    public void click_Faq_page() throws InterruptedException {
        clickMeButton(click_FAQ_page);

    }
public void make_some_action_on_faq_page() throws InterruptedException {
    clickMeButton(click_on_Faq_question);
    Thread.sleep(2000);
    clickMeButton(click_on_Faq_question);
}
    public void make_some_action_on_review_page() throws InterruptedException {
        clickMeButton(click_filter);
        Thread.sleep(2000);
        clickMeButton(click_filter_by_oldest);
    }

}
