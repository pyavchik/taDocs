package trueautomation;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TaGettingStartedTest {
    private WebDriver driver;
    private By installationClientLink = By.xpath(ta("installationClientLink", "//a[@href='#/README']"));
    private By apiKeyLink = By.xpath(ta("apiKeyLink", "//a[@href='#/getting-started/api-key']"));
    private By projectSetupLink = By.xpath(ta("projectSetupLink", "//a[@href='#/getting-started/project-setup']"));

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {
        driver.get("https://trueautomation.io/docs/");
        driver.findElement(installationClientLink).click();
        driver.findElement(apiKeyLink).click();
        driver.findElement(projectSetupLink).click();

    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}