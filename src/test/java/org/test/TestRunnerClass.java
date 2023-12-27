package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",
glue = "org.step",
monochrome = true,
plugin = {
		"html:target\\Cucumber.html",
		"junit:target\\xmlReport.xml",
		"json:target\\jsonReport.json" })


public class TestRunnerClass {
	@AfterClass
	public static void tc01() {
		ReportingClass.generateReport("target\\jsonReport.json");

	}
}