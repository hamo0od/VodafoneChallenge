package org.example.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/main/resources/Features",
        glue = "org.example.stepdefs",
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"


        }

)

public class TestRunners extends AbstractTestNGCucumberTests {
}
