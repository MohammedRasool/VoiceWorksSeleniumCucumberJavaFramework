package StepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Mohammed Rasool on 11/25/2020.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Smoke/",
        plugin={"json:target/cucumber.json","html:target/site/cucumber-pretty","junit:target/cucumber.xml"},
        glue= "StepDefinition")

public class TestRunner
{

}
