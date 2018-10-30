package trueautomation;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaTrueautomationClientTest {
    private WebDriver driver;
    private By trueautomationCommands = By.xpath(ta("trueautomationCommands", "//a[@href='#/client/commands']"));
    private By taInstallationClient = By.xpath(ta("taInstallationClient", "//a[@href='#/client/installation-client']"));
    private By taUninstallationClient = By.xpath(ta("taUninstallationClient", "//a[@href='#/client/uninstallation-client']"));

    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {
        driver.get("https://trueautomation.io/docs/");
        driver.findElement(trueautomationCommands).click();
        driver.findElement(taInstallationClient).click();
        driver.findElement(taUninstallationClient).click();


    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}