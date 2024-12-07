package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilties.Helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Test_Base {
    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})

    public void startDriver(@Optional("chrome")String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Microsoftedge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
    }
        driver.manage().window().maximize();
        driver.navigate().to("http://dev.advintic.com:9191/main/home");
    }
@AfterSuite
    public void stopDriver()
{
    //driver.quit();
}
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, result.getName());
            Helper.attachScreenshotToAllure(result.getName()); // Attach screenshot to Allure report
        }
}
}
