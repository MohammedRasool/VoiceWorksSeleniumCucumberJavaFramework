package StepDefinition;

import Utilities.DefaultProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class Hooks
{
    private WebDriver driver = null;

    private DefaultProperties runningConfig = new DefaultProperties();
    private Properties prop = runningConfig.envSetUp();

    private String browserID = prop.getProperty("Browser");

    @Before
    public void createDriver()
    {
        createDriver(browserID);
    }

    private void createDriver(final String browserId)
    {

        if (browserId.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browserId.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browserId.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver","./IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            driver = new ChromeDriver();
        }

    }

    public WebDriver getDriver()
    {
        return driver;
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        else
        {
            driver.close();
        }

        driver.quit();
        System.out.println("************************BROWSER CLOSED************************");
    }
}
