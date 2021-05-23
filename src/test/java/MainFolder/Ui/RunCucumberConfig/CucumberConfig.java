package MainFolder.Ui.RunCucumberConfig;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(features ="src/test/java/MainFolder/Ui/Feature/step.feature",glue = "MainFolder/Ui/Steps")
public class CucumberConfig {

}
