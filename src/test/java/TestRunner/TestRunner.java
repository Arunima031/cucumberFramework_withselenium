package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue={"StepDefinitions"},
monochrome=true,
        plugin={"pretty","html:target/HtmlReports/report.html"

},tags="@smoke"
)
public class TestRunner {


}
