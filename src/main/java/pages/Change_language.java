package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Change_language extends Page_Base{
    public Change_language(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/div/p-dropdown/div")
    public WebElement click_on_change_language;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/div/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li")
    public WebElement change_language_to_arabic;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/div/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[1]/li")
    public WebElement change_language_to_english;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/div/p-dropdown/div/span")
    public WebElement selectedLanguage;
    @FindBy(xpath = "/html/body/app-root/app-auth/div/div[1]/div/p-dropdown/div/span")
    public  WebElement check_changing_to_arabic;
}
