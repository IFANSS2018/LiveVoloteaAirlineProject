package co.volotea.stepefinition;

import co.volotea.locators.HomePage;
import co.volotea.resources.FunctionalLibrary;
import cucumber.api.java.en.Given;

public class HomeSteps extends FunctionalLibrary {
	@Given("the user in flight status page")
	public void the_user_in_flight_status_page() {
		HomePage home = new HomePage();
		

	}
}
