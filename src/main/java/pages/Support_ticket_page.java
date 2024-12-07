package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Support_ticket_page extends Page_Base{
    public Support_ticket_page(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[1]/app-side-bar/div/p-menu/div/ul/li[13]/div/a")
    WebElement click_on_support_ticket_page;
    @FindBy(xpath = "  /html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/input[4]")
    WebElement add_title;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/p-dropdown/div/span")
    WebElement select_category;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[3]/li/span[1]")
    WebElement chose_Maintenance;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[1]/li/span[1]")
    WebElement chose_network;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li/span[1]")
    WebElement chose_billing;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[4]/li/span[1]")
    WebElement chose_Teams;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/textarea")
    WebElement ticket_message;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/div/form/div/p-button/button")
    WebElement click_submit;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/section/div/div/p-table/div/div[2]/table/tbody/tr[1]/td[5]/button/span[1]")
    WebElement click_on_arrow_details;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/section/div/div/p-table/div/div[2]/table/tbody/tr[2]/td/div/app-chat/div/div[2]/input")
    WebElement write_message_and_chat_with_admin;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/div[2]/p-scrollpanel/div/div[1]/div/div/app-ticket-form/div/div[2]/section/div/div/p-table/div/div[2]/table/tbody/tr[2]/td/div/app-chat/div/div[2]/p-button/button/span[1]")
    WebElement click_send_message;
    public void clicking_support_ticket()
    {
        clickMeButton(click_on_support_ticket_page);
    }
    public void sending_ticket(String title,String message) throws InterruptedException {
        sendText(add_title,title);
        clickMeButton(select_category);
        Thread.sleep(2000);
        clickMeButton(chose_Maintenance);
        sendText(ticket_message,message);
        clickMeButton(click_submit);
    }
    public void sending_message_to_admin(String chat_message) throws InterruptedException {
        clickMeButton(click_on_arrow_details);
        Thread.sleep(2000);
        sendText(write_message_and_chat_with_admin,chat_message);
        Thread.sleep(2000);
        clickMeButton(click_send_message);
    }

}
