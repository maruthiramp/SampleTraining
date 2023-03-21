package steps;

import static org.testng.Assert.assertTrue;
import com.jacob.com.LibraryLoader;
import autoitx4java.AutoItX;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.HomePageActions;
import pages.actions.SearchCarsPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	

	HomePageActions homePageActions = new HomePageActions();
	SearchCarsPageActions searchCarsPageActions= new SearchCarsPageActions();
	
	@Given("user is on the HomePage {string} of Cars Guide website")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("user moves to Buy+Sell menu")
	public void user_moves_to_buy_sell_menu() {
		homePageActions.moveToBuyAndSellMenu();
	}

	@And("user clicks on Search Cars link")
	public void user_clicks_on_search_cars_link() {
		homePageActions.clickOnSearchCars();
	}


	@And("user clicks on {string} link")
	public void user_clicks_on_cartype_link(String carType) {
		if(carType.equals("New")) {
			homePageActions.clickOnSearchCars();
		}else if(carType.equals("Used")) {
			homePageActions.clickOnUsedCarsSearch();
		}
		}
		

	
	@And("user clicks on Used link")
	public void user_clicks_on_Used_link() {
		homePageActions.clickOnUsedCarsSearch();
	}

	@And("selects car brand as {string} from Make dropdown")
	public void selects_car_brand_as_from_make_dropdown(String make) {
		searchCarsPageActions.selectCarMake(make);
	}

	@And("selects car modal as {string} from Modal dropdown")
	public void selects_car_modal_as_from_modal_dropdown(String modal) {
		searchCarsPageActions.selectCarModal(modal);
	}

	@And("selects location as {string} from Location dropdown")
	public void selects_location_as_from_location_dropdown(String location) {
		searchCarsPageActions.selectLocation(location);
	}

	@And("selects max price as {string} from Max Price dropdown")
	public void selects_max_price_as_from_max_price_dropdown(String price) {
		searchCarsPageActions.selectPrice(price);
	}

	@And("clicks on Find My Next Car button")
	public void clicks_on_find_my_next_car_button() {
		searchCarsPageActions.clickOnFindMyNextCarButton();
	}

	@Then("user should see list of search cars")
	public void user_should_see_list_of_search_cars() {
		System.out.println("Car list found");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		
	}
	
	@When("run the notepad")
	public void run_the_notepad() throws IOException, InterruptedException {
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\1.exe");
		Thread.sleep(3000L);
	}
	
	@And("execute step 2")
	public void execute_step_2() throws IOException, InterruptedException {
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\2.exe");
		Thread.sleep(3000L);
		
	}

	@And("execute step 3")
	public void execute_step_3() throws IOException, InterruptedException {
		AutoItX autoItObj = AutoItX();
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\3.exe");	
		Thread.sleep(3000L);
	}
	
	@And("execute step 4")
	public void execute_step_4() throws IOException {
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\4.exe");	
	}
}
