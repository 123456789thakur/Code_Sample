package steps;

public class LoginSteps {
	    org.openqa.selenium.WebDriver driver;

	    public LoginSteps() { /* compiled code */ }

	    @cucumber.api.java.Before
	    public void setup() throws java.io.IOException { /* compiled code */ }

	    @cucumber.api.java.After
	    public void tearDown() { /* compiled code */ }

	    @cucumber.api.java.en.Given("^user navigates to \"([^\"]*)\"$")
	    public void user_navigates_to(java.lang.String url) throws java.lang.Throwable { /* compiled code */ }

	    @cucumber.api.java.en.When("^user clicks on the login portal button$")
	    public void user_clicks_on_the_login_portal_button() throws java.lang.Throwable { /* compiled code */ }

	    @cucumber.api.java.en.And("^user enters the \"([^\"]*)\" username$")
	    public void user_enters_the_username(java.lang.String username) throws java.lang.Throwable { /* compiled code */ }

	    @cucumber.api.java.en.And("^user enter the \"([^\"]*)\" password$")
	    public void user_enter_the_password(java.lang.String password) throws java.lang.Throwable { /* compiled code */ }

	    @cucumber.api.java.en.When("^user clicks on the login button$")
	    public void user_clicks_on_the_login_button() throws java.lang.Throwable { /* compiled code */ }

	    @cucumber.api.java.en.Then("^the user should be presented with the following prompt alert \"([^\"]*)\"$")
	    public void the_user_should_be_presented_with_the_following_prompt_alert(java.lang.String message) throws java.lang.Throwable { /* compiled code */ }
	}


