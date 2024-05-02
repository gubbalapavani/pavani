package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pavan\\OneDrive\\Documents\\pavani_java\\BDDcucumber\\src\\test\\resources\\featurefile\\Google.feature",glue="stepdef")
public class GoogleRunner {

}
