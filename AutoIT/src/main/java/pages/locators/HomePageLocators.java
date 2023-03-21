package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath = "//a[contains(text(),'buy + sell')]")
	public WebElement buyAndSellLink;
	
	@FindBy(xpath = "//a[contains(text(),'Search Cars')]")
	public WebElement searchCars;
	
	@FindBy(xpath = "//a[contains(text(),'Used')]")
	public WebElement usedCars;
	
}
