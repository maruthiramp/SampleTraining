package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import utils.SeleniumDriver;

public class SearchCarsPageActions {
	
	SearchCarsPageLocators searchCarsPageLocators;
	
	public SearchCarsPageActions() {
		this.searchCarsPageLocators = new SearchCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarsPageLocators);
	}

	public void selectCarMake(String carMake) {
		Select carMaker = new Select(searchCarsPageLocators.makeDropdown);
		carMaker.selectByVisibleText(carMake);
	}
	
	public void selectCarModal(String carModal) {
		Select carsModal = new Select(searchCarsPageLocators.modalDropdown);
		carsModal.selectByVisibleText(carModal);
	}
	
	public void selectLocation(String location) {
		Select carsLocation = new Select(searchCarsPageLocators.locationDropdown);
		carsLocation.selectByVisibleText(location);
	}
	
	public void selectPrice(String price) {
		Select carsPrice = new Select(searchCarsPageLocators.priceDropdown);
		carsPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton() {
		searchCarsPageLocators.findMyNextCarButton.click();
	}
	
	
	
}
