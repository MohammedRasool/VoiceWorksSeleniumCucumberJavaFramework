package Pages;

import Elements.TextFields;
import Utilities.ExplicitWait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class LandingPage
{
    private WebDriver driver;
    private TextFields textField;
    private ExplicitWait explicitWait;


    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        explicitWait = new ExplicitWait(driver);
        textField = new TextFields(driver);
    }


    @FindBy(xpath="//input[@id='searchsubmit']")
    private WebElement btn_FilterByName;

    @FindBy(xpath="//input[@id='searchbox']")
    private WebElement tf_FilterByComputerName;

    @FindBy(xpath="//div/em")
    private WebElement lbl_TableMessage;


    public void filterComputerName(String ComputerName)
    {
        enterComputerName(ComputerName);
        clickFilterByNameButton();
    }

    private void enterComputerName(String ComputerName)
    {
        textField.typeText(tf_FilterByComputerName, ComputerName);
    }

    private void clickFilterByNameButton()
    {
        btn_FilterByName.click();
    }

    public void clickonRecordLink(String LinkName)
    {
        driver.findElement(By.linkText(LinkName)).click();
    }

    public void verifyNoRecordOnTable(String Message)
    {
        Assert.assertTrue("TABLE DOES IS NOT EMPTY !", lbl_TableMessage.getText().contains(Message));
    }

    public void verifyPageSubHeader(String SubHeaderName) throws InterruptedException
    {
        By ButtonElement = By.xpath("//h1[contains(text(),'"+SubHeaderName+"')]");
        explicitWait.waitForElement(ButtonElement, 2);

        Thread.sleep(1000L);
    }

    public void verifyAlertIsDisplayed(String AlertMessage)
    {
        By alertElement = By.xpath("//div[@class='alert-message warning']");
        explicitWait.waitForElement(alertElement, 2);

        Assert.assertTrue("Login was unsuccessful", driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText().contains(AlertMessage));
    }

    public void verifyMainPageHeaderIsDisplayed(String MainHeaderName)
    {
        Assert.assertTrue("INITIAL PAGE LOAD WAS UNSUCCESSFUL", driver.findElement(By.linkText(MainHeaderName)).isDisplayed());
    }

}
