package steps;


	import org.openqa.selenium.By;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import utils.DriverFactory;

	public class ProductStepsHooks extends DriverFactory {
		@Given("^user navigates to \"([^\"]*)\" website$")
		public void user_navigates_to_website(String url) throws InterruptedException {
			Thread.sleep(2000);
			getDriver().get(url);
		}

		@When("^user clicks on \"([^\"]*)\"$")
		public void user_clicks_on(String locator) throws InterruptedException {
			Thread.sleep(2000);
			getDriver().findElement(By.cssSelector(locator)).click();
		}

		@Then("^user should be presented with a promo alert$")
		public void user_should_be_presented_with_a_promo_alert() throws InterruptedException  {
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();
		}

	}


