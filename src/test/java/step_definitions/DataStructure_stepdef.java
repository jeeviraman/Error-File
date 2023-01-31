package step_definitions;


	

	import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import constants.LoggerLoad;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import page_objects.DataStructurePage;
import webdriver_manager.DriverManager;
	

	public class DataStructure_stepdef {
		DataStructurePage dspage = new DataStructurePage();
		WebDriver driver= DriverManager.getDriver();
		//String Excelpath = ConfigReader.getExcelFilepath();
		 String enterCode;
		
		 @Given("The user is on the Dsalgo portal")
		 public void the_user_is_on_the_dsalgo_portal() {
		     System.out.println("The user is on the Dsalgo portal");
		 }

		 @Given("user clicks signin link")
		 public void user_clicks_signin_link() {
			 System.out.println("user clicks signin link");
		 }

		 @When("user gives valid {string} and {string}")
		 public void user_gives_valid_and(String string, String string2) {
			 System.out.println("user gives valid username and password"); 
		 }

		 @Given("The user is in Home page")
		 public void the_user_is_in_home_page() {
			 System.out.println("The user is in Home page");
		 }

		 @Given("The user is in Data structure Introduction page")
		 public void the_user_is_in_data_structure_introduction_page() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Then("The user is redirected to Time complexity page")
		 public void the_user_is_redirected_to_time_complexity_page() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Given("The user is in Time complexity Introduction page")
		 public void the_user_is_in_time_complexity_introduction_page() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Then("The user is redirected to a  tryEditor page")
		 public void the_user_is_redirected_to_a_try_editor_page() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Given("The user is in a page having an tryEditor with a Run button to test")
		 public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @When("The user enter valid python code in tryEditor page")
		 public void the_user_enter_valid_python_code_in_try_editor_page() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @When("The user clicks on run button")
		 public void the_user_clicks_on_run_button() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Then("The user should be presented with Run result")
		 public void the_user_should_be_presented_with_run_result() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @When("The user enter python code with invalid syntax in tryEditor")
		 public void the_user_enter_python_code_with_invalid_syntax_in_try_editor() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		 @Then("The user should be presented with error message")
		 public void the_user_should_be_presented_with_error_message() {
		     // Write code here that turns the phrase above into concrete actions
		     throw new io.cucumber.java.PendingException();
		 }

		@When("The user clicks on {string} button on Data Structure Introduction link")
		public void the_user_clicks_on_button_on_data_structure_introduction_link(String string) {
		    System.out.println("The user clicks on Get started button on Data Structure Introduction link");
		    dspage.DataStructure();
		}

		
		

		@Then("The user is directed to Data Structure Introduction page")
		public void the_user_is_directed_to_data_structure_introduction_page(String pagename) {
			LoggerLoad.info("user is redirected to "+ pagename+"page");
			String Title = dspage.getPageTitle();
			LoggerLoad.info("Title of current page is "+ Title);
			assertEquals(Title,pagename, "Title do not match");
			
		}
		    
		

		@When("The user clicks on {string} button on Time complexity page")
		public void the_user_clicks_on_button_on_time_complexity_page(String string) {
		   dspage.Timecomplexity_DS();
		   System.out.println("The user clicks on {string} button on Time complexity page");
		}

		@Then("The user is redirected to a tryeditor page ")
		public void the_user_is_redirected_to_a_tryeditor_page(String String) {	
			String Title = dspage.getPageTitle();
			LoggerLoad.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title not matched");
			
			dspage.EnterPhytonCode("print(\"Implementation in Datastructure\")");
			dspage.clicktryeditor();
		}	
		    
		@Then("user is redirected to Home page")
		public void user_is_redirected_to_Home_page() {
		    driver.navigate().back();
		}

	}

		

		

		

		

		

		

		

		

		


