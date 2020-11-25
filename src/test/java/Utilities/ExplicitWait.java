package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */
public class ExplicitWait
{
    private WebDriver driver;

    public ExplicitWait(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = null;
        try {
            System.out.println("Waiting for max:: " + timeout + " seconds for element TO APPEAR\n");

            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element HAS APPEARED on the web page");
        } catch(Exception e) {
            System.out.println("Element HAS NOT APPEARED on the web page");
        }
        return element;
    }

    public void waitForElementToDisappear(By locator, int timeout) {
        WebElement element = null;
        try {
            System.out.println("Waiting for max:: " + timeout + " seconds for element TO DISAPPEAR");

            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(
                    ExpectedConditions.invisibilityOfElementLocated(locator));
            System.out.println("Element HAS DISAPPEARED from the web page");
        } catch(Exception e) {
            System.out.println("Element has NOT DISAPPEARED from the web page");
        }
    }

    public void clickWhenReady(By locator, int timeout) {
        try {
            WebElement element = null;
            System.out.println("Waiting for max:: " + timeout + " seconds for element to be clickable");

            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(
                    ExpectedConditions.elementToBeClickable(locator));
            element.click();
            System.out.println("Element clicked on the web page");
        } catch(Exception e) {
            System.out.println("Element not appeared on the web page");
        }
    }
}
