package Day10_05282022;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusable_libraries.Reusable_Actions;

import java.util.ArrayList;

public class TestNG_Example_ForLoop {

    // declare the local driver outside so that it can be a reusable with other annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
  @BeforeSuite
  public void SetChromeDriver(){
       driver = Reusable_Actions.setDriver();

  }// end of before suite annotation

    // Test case 1: navigate to google and enter a key word on the search field
    @Test
    public void SearchforKeyword() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for (int i = 0; i < cars.size(); i++) {

            driver.navigate().to("https://www.google.com");
            // Enter a keyword on the search field
            Reusable_Actions.sendKeysAction(driver, "//*[@name = 'q']", cars.get(i), "Search Field");
            // Submit the go button
            Reusable_Actions.submitAction(driver, "//*[@name='btnK']", " google search button");

            // Capture Search Result
            String result = Reusable_Actions.getTextAction(driver, "//*[@id='result-stats']", "Search Result Text");
            // Split the result by single space and print out the search number
            String[] arrayResult = result.split(" ");
            System.out.println("Search number for " + cars.get(i) +" is "+ arrayResult[1]);

        }// end of loop

        }// end of test


   @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite


}// end of class
