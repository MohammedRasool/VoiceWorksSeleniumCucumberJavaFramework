package Pages;

import Elements.ComboBox;
import Elements.TextFields;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class AddComputerPage
{
    private WebDriver driver;
    private TextFields textField;
    private ComboBox comboBox;


    public AddComputerPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        textField = new TextFields(driver);
        comboBox = new ComboBox(driver);
    }

    @FindBy(xpath="//input[@id='name']")
    private WebElement tf_ComputerName;

    @FindBy(xpath="//input[@id='introduced']")
    private WebElement tf_IntroducedDate;

    @FindBy(xpath="//input[@id='discontinued']")
    private WebElement tf_DiscontinuedDate;

    @FindBy(xpath="//select[@id='company']")
    private WebElement dd_Company;


    public void fillComputerInformation(String ComputerName, String IntroducedDate, String DiscontinuedDate, String Company)
    {
        enterComputerName(ComputerName);
        enterIntroducedDate(IntroducedDate);
        enterDiscontinuedDate(DiscontinuedDate);
        selectCompany(Company);
    }

    private void enterComputerName(String ComputerName)
    {
        textField.typeText(tf_ComputerName, ComputerName);
    }

    private void enterIntroducedDate(String IntroducedDate)
    {
        textField.typeText(tf_IntroducedDate, IntroducedDate);
    }

    private void enterDiscontinuedDate(String DiscontinuedDate)
    {
        textField.typeText(tf_DiscontinuedDate, DiscontinuedDate);
    }

    private void selectCompany(String Company)
    {
        comboBox.selectOption(dd_Company, Company);
    }

    public void verifyRetrievedComputerDetails(String ComputerName, String IntroducedDate, String DiscontinuedDate, String Company)
    {
        tf_ComputerName.getText().contains(ComputerName);
        tf_IntroducedDate.getText().contains(IntroducedDate);
        tf_DiscontinuedDate.getText().contains(DiscontinuedDate);
        dd_Company.getText().contains(Company);
    }

}
