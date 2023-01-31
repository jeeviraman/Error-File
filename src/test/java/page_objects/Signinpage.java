package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_manager.DriverManager;

public class Signinpage {
	
	private static Signinpage loginpageInstance;
	//Dummy private constructor prevents the object creation 
	public Signinpage() {
		PageFactory.initElements(DriverManager.getDriver(),this);
		
	}
//this method prevents second object creation for the same type,Singleton pattern
	public static Signinpage getInstance()
	{
 if(loginpageInstance==null) {
		 loginpageInstance = new Signinpage();
	}
	return loginpageInstance;
}
	@FindBy (linkText =("sign in"))WebElement Signinlink;
	@FindBy (id="id_username")private WebElement txt_username;
	@FindBy (id="id_password")WebElement txt_password;
	@FindBy (xpath="//input[@value=\"Login\"]")WebElement lin_login;
	
	public void StringinLinkbtn()
	{
		Signinlink.click();
	}
}