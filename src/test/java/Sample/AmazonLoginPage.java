package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriverManager.edgedriver().setup()",("Path/to/edge.driver"));

		 

				WebDriver driver = new edge.Driver();

		 

			driver.get("https://www.amazon.com");

		 

			WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));

		 

			signInLink.click();

		 

			WebElement emailfield = driver.findElement(By.id("ap_email"));

		 

			emailfield.sendKeys("your_emailexample.com");

		 

			WebElement continueButton = driver.findElement(By.id("continue"));

		 

			continueButton.click();

		 

			WebElement passwordField = driver.findElement(By.id("ap_password"));

		 

			passwordField.sendKeys("your_password");

		 

			WebElement signInButton = driver.findElement(By.id("signInSubmit"));

		 

			signInButton.click();

		 

			driver.quit();

			}

		

	}


