package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html: target/default-html-reports",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",},
        features = "src/test/resources/features/",
        glue = "Step_definitions",
        dryRun =false,
        tags = "@mod"

)
public class CukesRunner {
}