package Elements;

import Utilities.ExplicitWait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class Buttons
{
    private WebDriver driver;
    private ExplicitWait explicitWait;
    private Actions builder;

    public Buttons(WebDriver driver)
    {
        this.driver=driver;

        explicitWait = new ExplicitWait(driver);
        builder = new Actions(driver);
    }


    public void clickLinkWithCaption(String Caption)
    {
        boolean linkPresent = false;

        By ButtonElement = By.xpath("//a[text()='"+Caption+"']");
        explicitWait.waitForElement(ButtonElement, 2);

        WebElement Link = driver.findElement(By.xpath("//a[contains(text(),'"+Caption+"')]"));

        if (Link.isDisplayed())
        {
            Link.click();
            linkPresent = true;
        }

        Assert.assertTrue("LINK: \""+Caption+"\" IS NOT PRESENT",linkPresent);
    }

    public void clickButtonWithCaption(String Caption) throws InterruptedException
    {
        boolean buttonPresent = false;

        By ButtonElement = By.xpath("//input[@value='"+Caption+"']");
        explicitWait.waitForElement(ButtonElement, 2);

        WebElement Button = driver.findElement(By.xpath("//input[@value='"+Caption+"']"));

        if(Button.isDisplayed())
        {
            Button.click();
            buttonPresent = true;
        }

        Assert.assertTrue("BUTTON: \""+Caption+"\" IS NOT PRESENT",buttonPresent);
    }
}
