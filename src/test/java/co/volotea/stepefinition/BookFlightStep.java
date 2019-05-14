package co.volotea.stepefinition;
import co.volotea.locators.BookFlight;
import co.volotea.resources.FunctionalLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightStep extends FunctionalLibrary{
	
	@When("user fill all details in search flight")
	public void user_fill_all_details_in_search_flight() {
		BookFlight b = new BookFlight();
		click(b.getClickoneWay());
	//	selectByText(b.getClicksource(),"Bari");
		//selectByValue(b.getClicksource(),"BRI");
		selectByValue(b.getClickChild(),"3");	
		
	}

	@Then("user click find flights")
	public void user_click_find_flights() {
		BookFlight b = new BookFlight();
		click(b.getClickflightBtn());
	}
}
