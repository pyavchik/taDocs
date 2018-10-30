package selenium;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class SeleniumTrueautomationClientTest {
    private WebDriver driver;
    private By trueautomationCommands = By.xpath("//a[@href='#/client/commands']");
    private By taInstallationClient = By.xpath("//a[@href='#/client/installation-client']");
    private By taUninstallationClient = By.xpath("//a[@href='#/client/uninstallation-client']");

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
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