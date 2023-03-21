package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocators homePageLocators;

	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}

	public void moveToBuyAndSellMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.buyAndSellLink).build().perform();
	}

	public void clickOnSearchCars() {
		homePageLocators.searchCars.click();
	}
	
	public void clickOnUsedCarsSearch() {
		homePageLocators.usedCars.click();
	}

}
