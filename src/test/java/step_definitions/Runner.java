package step_definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:/Users/Navdeep/eclipse-workspace/TransfotechAcademy/src/test/java/feature"} , glue= {"step_definitions"}, monochrome= true, plugin={"pretty", "html:target/ExecutionReport"}, publish = true)
public class Runner {

}
