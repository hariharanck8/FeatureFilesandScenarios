package login_Test_StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Login_Test1.feature",
		glue={"login_Test_StepDef"},
		plugin= {"pretty","html:target/htmlReport.html"}
		
		)
public class Login_Test1_Runner {

}
