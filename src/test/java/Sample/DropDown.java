package Sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver(); //launch the browser

		driver.manage().window().maximize(); // maximize the browser

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 

		driver.get("http://www.calculator.net/interest-calculator.html") ;

		Select select = new Select(driver.findElement(By.id("ccompound")));

        System.out.println("Select the Option by Index 3");

        select.selectByIndex(3);

        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
 
        driver.quit();

	}

}
