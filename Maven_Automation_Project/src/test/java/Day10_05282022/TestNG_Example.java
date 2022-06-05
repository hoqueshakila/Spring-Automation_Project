package Day10_05282022;

import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusable_libraries.Reusable_Actions;

import java.sql.Driver;

public class TestNG_Example {

    // declare the local driver outside so that it can be a reusable with other annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
  @BeforeSuite
  public void SetChromeDriver(){
       driver = Reusable_Actions.setDriver();

  }// end of before suite annotation

    // Test case 1: navigate to google and enter a key word on the search field
    @Test (priority= 1)
    public void SearchforKeyword(){
        driver.navigate().to("https://www.google.com");

        // Enter a keyword on the search field
        Reusable_Actions.sendKeysAction(driver,"//*[@name = 'q']","BMW","Search Field");
        // Submit the go button
        Reusable_Actions.submitAction(driver,"//*[@name='btnK']"," google search button");

        }// end of test 1

    /* dependsOnMethods used when following @Test is dependent on previous @test method. Then if the first test fails,
    then the dependent test will get skipped

     */
    @Test (dependsOnMethods = "SearchforKeyword")
    public void CaptureSearchNumber(){
      // Capture Search Result
        String result = Reusable_Actions.getTextAction(driver,"//*[@id='result-stats']","Search Result Text");
        // Split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);

    }// end of test 2

   @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite


}// end of Java class
