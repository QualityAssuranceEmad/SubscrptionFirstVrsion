package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Change_language;

public class Change_language_Test extends Test_Base{
    Change_language language_object;
    @Test(priority = 1)
    public void testLanguageSwitch() throws InterruptedException {
        // Locate the element showing the currently selected language
        Thread.sleep(4000);
        language_object=new Change_language(driver);
        String language = language_object.selectedLanguage.getText();

        // Check if the currently selected language is "EN"
        if (language.equalsIgnoreCase("EN")) {
            System.out.println("Currently selected language is English. Switching to Arabic...");

            // Click to open the dropdown menu
            language_object.click_on_change_language.click();
            Thread.sleep(1000); // Wait for the dropdown to expand

            // Select "AR" from the dropdown options
            language_object.change_language_to_arabic.click();
            System.out.println("Switched to Arabic.");

        } else if (language.equalsIgnoreCase("AR")) {
            System.out.println("Currently selected language is Arabic. No action needed.");
        } else {
            System.out.println("Unexpected language option: " + language);
            Assert.fail("Unexpected language option.");
        }

        // Optionally, verify that the language switch was successful
        Thread.sleep(4000); // Wait for the language change to take effect
        Assert.assertEquals(language_object.check_changing_to_arabic.getText(), "AR", "The language switch to Arabic did not succeed.");
    }
}
