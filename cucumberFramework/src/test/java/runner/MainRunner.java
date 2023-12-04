package runner;

  @org.junit.runner.RunWith(cucumber.api.junit.Cucumber.class)
	@cucumber.api.CucumberOptions(features = {"src/test/java/CucumberFramework/featureFiles/"}, glue = {"CucumberFramework.steps"}, monochrome = true, tags = {}, plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})
	public class MainRunner {
	    public MainRunner() { /* compiled code */ }
	}

  