package page_objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import webdriver_manager.DriverManager;


    public class DataStructurePage { 
	public static WebDriver driver;
	private static DataStructurePage loginPageInstance;	

		@FindBy(xpath="//a[@href='/home']")WebElement Dsalgoportal_link;
		
		@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement Datastructure_intro_link;
		@FindBy(xpath="//a[@href='\time-complexity\']")WebElement Timecomplexity_link;
		@FindBy(xpath="//a[@href='/tryEditor\']")WebElement Tryeditor_link;
		@FindBy(xpath="//div[text()='Run']")WebElement Run_link;
		
		public  DataStructurePage (){
		
		PageFactory.initElements(driver,this);
		PageFactory.initElements(DriverManager.getDriver(), this);
		}
		public static DataStructurePage getInstance() {
			if (loginPageInstance==null) {
				loginPageInstance=new DataStructurePage();
				
			}
			return loginPageInstance;
		}
		
		 public void getstarted_dsalgo() {
			 //Loggerload.info("click"+ Datastructure_intro_link.getText()+"link on homepage");
			 Dsalgoportal_link.click(); 
		 }
		 public String getPageTitle() {
				String title = driver.getTitle();
				return title;
			}
		public void DataStructure() {
		Datastructure_intro_link.click();	
			
		}
		
		public void Timecomplexity_DS() {
		 Timecomplexity_link.click();	
		
		}

		public void clicktryeditor() {
			Tryeditor_link.click();
			
		}
		public void EnterPhytonCode(String validPythonCode) {
			Tryeditor_link.sendKeys(validPythonCode);
			
		}
		public void Run_link() {
			Run_link.click();
			
		driver.navigate().back();

	}
		
		
		
	}

