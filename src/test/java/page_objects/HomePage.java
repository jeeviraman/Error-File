package page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import webdriver_manager.DriverManager;

public class HomePage {

private static HomePage loginPageInstance;
	
	//Dummy private constructor prevents the object create
	private HomePage() {
		
	}
	
	//this method prevents duplicate object creation, Singleton pattern lazy loading
	public static HomePage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new HomePage();		
		}
		
		return loginPageInstance;
		
	}
		
	
	@FindBy(className="btn") 
	 WebElement btngetstarted;
	
	public void btn_getstartedclick() {
		
		btngetstarted.click();
		System.out.println("user clicks get started button");
	}
	public String redirected_to_homepage() {
	
	String title = DriverManager.getDriver().getTitle();
	return title;
		
}
}