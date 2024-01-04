package runner;

import io.cucumber.testng.CucumberOptions;

import base.BaseClass;


@CucumberOptions(features = "src/main/java/feature", glue = "pages", 
monochrome = true,
//tags = "not @Login"
tags = "@Datatable")
public class RunnerClass extends BaseClass{

}
