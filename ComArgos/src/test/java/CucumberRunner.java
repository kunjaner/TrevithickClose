import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "/Users/kunjankumarpatel/IdeaProjects/ComArgos/src/test/resources",plugin = "json:target/cucumber.json"
                  ,dryRun = false)

public class CucumberRunner {


}
