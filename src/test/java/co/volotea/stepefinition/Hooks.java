package co.volotea.stepefinition;


import co.volotea.resources.FunctionalLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	@Before
	public static void beforeMethod() {
		FunctionalLibrary.driverInit("Chrome");
	}

	@After
	public static void aftermethod() {
		FunctionalLibrary.closeBrowser();
		FunctionalLibrary.quitBrowser();
	}

}
