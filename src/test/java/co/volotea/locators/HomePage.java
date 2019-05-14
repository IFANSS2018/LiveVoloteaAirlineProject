package co.volotea.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.volotea.resources.FunctionalLibrary;

public class HomePage {
	public HomePage() {
		 PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	 @FindBy(xpath="//h2[@class='main-item hover']")
		private WebElement moverFlights;
	 @FindBy(xpath = "//*[text()='Search Flights']")
		private WebElement flightBook;
	 
	 public WebElement getMoverFlights() {
		return moverFlights;
	}
	public WebElement getFlightBook() {
		return flightBook;
	}

}
