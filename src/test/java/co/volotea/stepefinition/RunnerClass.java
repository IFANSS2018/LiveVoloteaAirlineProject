package co.volotea.stepefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\searchflight.feature", glue = {"co.volotea.stepefinition" },
monochrome = true, dryRun = false, strict =true)

public class RunnerClass {

}
