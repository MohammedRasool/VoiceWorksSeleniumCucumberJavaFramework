package StepDefinition;

import Elements.Buttons;
import Pages.AddComputerPage;
import Pages.LandingPage;
import cucumber.api.java.en.Then;


/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class Computers
{
    private Hooks hooks;
    private AddComputerPage addComputerPage;
    private LandingPage landingPage;
    private Buttons buttons;


    public Computers(Hooks hooks)
    {
        this.hooks=hooks;

        buttons = new Buttons(hooks.getDriver());
        addComputerPage = new AddComputerPage(hooks.getDriver());
        landingPage = new LandingPage(hooks.getDriver());

    }


    @Then("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String ButtonName) throws InterruptedException
    {
        Thread.sleep(1000L);
        buttons.clickButtonWithCaption(ButtonName);
    }

    @Then("^I fill up the Computer details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillUpTheComputerDetailsAnd(String ComputerName, String IntroducedDate, String DiscontinuedDate, String Company)
    {
        addComputerPage.fillComputerInformation(ComputerName, IntroducedDate, DiscontinuedDate, Company);
    }

    @Then("^I verify that alert \"([^\"]*)\" is displayed$")
    public void iVerifyThatAlertIsDisplayed(String AlertMessage)
    {
        landingPage.verifyAlertIsDisplayed(AlertMessage);
    }

    @Then("^I click on the \"([^\"]*)\" link$")
    public void iClickOnTheLink(String LinkName)
    {
        buttons.clickLinkWithCaption(LinkName);
    }

    @Then("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String ComputerName)
    {
        landingPage.filterComputerName(ComputerName);
    }

    @Then("^I click on the record that contains \"([^\"]*)\"$")
    public void iClickOnTheRecordThatContains(String ComputerName)
    {
        landingPage.clickonRecordLink(ComputerName);
    }

    @Then("^I verify that \"([^\"]*)\" details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are retrieved$")
    public void iVerifyThatDetailsAndAreRetrieved(String ComputerName, String IntroducedDate, String DiscontinuedDate, String Company)
    {
        addComputerPage.verifyRetrievedComputerDetails(ComputerName, IntroducedDate, DiscontinuedDate, Company);
    }

    @Then("^I verify that table displays message \"([^\"]*)\"$")
    public void iVerifyThatTableDisplaysMessage(String Message)
    {
        landingPage.verifyNoRecordOnTable(Message);
    }

    @Then("^I verify page subheader \"([^\"]*)\"$")
    public void iVerifyPageSubheader(String SubHeaderName) throws InterruptedException
    {
        landingPage.verifyPageSubHeader(SubHeaderName);
    }
}

