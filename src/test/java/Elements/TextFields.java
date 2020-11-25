package Elements;

import Utilities.ExplicitWait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class TextFields
{
    private WebDriver driver;
    private ExplicitWait explicitWait;

    public TextFields(WebDriver driver)
    {
        this.driver = driver;

        explicitWait = new ExplicitWait(driver);
    }

    public void typeText(WebElement element, String Option)
    {
        By ButtonElement = By.xpath("//h1");
        explicitWait.waitForElement(ButtonElement, 2);

        element.clear();
        element.sendKeys(Option);

        boolean optionPresent = false;

       if (element.getAttribute("value").equals(Option))
        {
                optionPresent = true;
        }

        Assert.assertTrue("Value: \"" + Option + "\" HAS NOT BEEN SET TO TEXT FIELD", optionPresent);
    }
}
