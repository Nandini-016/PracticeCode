package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
@Test
public  void exam()

 {

	 WebDriverManager.edgedriver().setup();

	 WebDriver driver=new EdgeDriver();

	 driver.manage().window().maximize();

     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 driver.get("https://www.google.com/");

 }

}


