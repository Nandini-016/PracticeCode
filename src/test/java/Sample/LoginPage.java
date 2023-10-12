package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//Declaration
   @FindBy(id="APjFqb")
   private WebElement googleSearchEdt;
   private WebDriver driver;
   
   //Initialization
   
   public LoginPage(WebDriver driver)
   {
	   //PageFactory.initElements(driver,this)
	   this.driver=driver;
   }
   
   //Utilization
   public WebElement getGoogleSearchEdt() 
   {
	   return googleSearchEdt;
   }
   
   //Business Logic
   public void clickOnSearch(String name) {
	   googleSearchEdt.sendKeys(name);
   }
   
   
}
