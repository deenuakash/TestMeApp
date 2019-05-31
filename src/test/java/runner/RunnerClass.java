package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/sampledemo.feature",
				 glue="stepDefinition",
				 plugin="html:C://report",
				 tags={"~@case1,@case2"})
public class RunnerClass {

}
