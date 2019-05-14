package co.volotea.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.volotea.resources.FunctionalLibrary;

public class BookFlight extends FunctionalLibrary{
	public BookFlight() {
		PageFactory.initElements(FunctionalLibrary.driver,this);
	}
	
	@FindBy(xpath="(//*[@class='iCheck-helper'])[4]")
	private WebElement clickoneWay;
	@FindBy(xpath="((//*[@name='from']/optgroup)[1]/option")
	private WebElement clicksource;
	@FindBy(xpath="//*[@name='to']/optgroup[1]/option")
	private WebElement clickDest;
	@FindBy(name="children")
	private WebElement clickChild;
	@FindBy(xpath="//a[text()='FIND FLIGHTS']")
	private WebElement clickflightBtn;
	
	public WebElement getClickoneWay() {
		return clickoneWay;
	}
	public WebElement getClicksource() {
		return clicksource;
	}
	public WebElement getClickDest() {
		return clickDest;
	}
	
	public WebElement getClickChild() {
		return clickChild;
	}
	public WebElement getClickflightBtn() {
		return clickflightBtn;
	}
	
	
	
	
	

}
