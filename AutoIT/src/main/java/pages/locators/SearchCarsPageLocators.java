package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCarsPageLocators {
	
	@FindBy(xpath = "//select[@id='makes']")
	public WebElement makeDropdown;

	@FindBy(xpath = "//select[@id='models']")
	public WebElement modalDropdown;
	
	@FindBy(xpath = "//select[@id='locations']")
	public WebElement locationDropdown;
	
	@FindBy(xpath = "//select[@id='priceTo']")
	public WebElement priceDropdown;
	
	@FindBy(xpath = "//input[@id='search-submit']")
	public WebElement findMyNextCarButton;
	
	
	
	
	
	
	
	
}
