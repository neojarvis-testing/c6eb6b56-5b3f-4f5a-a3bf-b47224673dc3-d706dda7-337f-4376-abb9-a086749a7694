package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/coder/project/workspace/Project/features", glue = "stepdefinitions")

public class TestAvonCycles {
    
}
