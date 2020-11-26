package StepDefinition;

import Pages.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class InitialSteps
{
    private WebDriver driver;
    private Hooks hooks;
    private LandingPage landingPage;


    public InitialSteps(Hooks hooks)
    {
        this.hooks=hooks;

        landingPage = new LandingPage(hooks.getDriver());
    }


    @Given("^I navigate to the \"([^\"]*)\" URL$")
    public void iNavigateToTheURL(String URL)
    {
        driver = hooks.getDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open URL on window
        driver.get(URL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^I verify that main header \"([^\"]*)\" is displayed after logging in$")
    public void iVerifyThatMainHeaderIsDisplayed(String HeaderMessage)
    {
        landingPage.verifyMainPageHeaderIsDisplayed(HeaderMessage);
    }
}

