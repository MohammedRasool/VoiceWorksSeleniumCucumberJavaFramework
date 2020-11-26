package Elements;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class ComboBox
{
    private WebDriver driver;

    public ComboBox(WebDriver driver)
    {
        this.driver = driver;
    }

    public void selectOption(WebElement element, String Option)
    {
        Select select = new Select(element);

        boolean optionPresent = false;

        try
        {
            select.selectByVisibleText(Option);
            optionPresent = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertTrue("VALUE: \"" + Option + "\" HAS NOT BEEN SELECTED FROM THE COMBOBOX", optionPresent);
    }
}
