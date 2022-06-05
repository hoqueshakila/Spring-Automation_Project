package Day11_05292022;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusable_libraries.Reusable_Actions;
import reusable_libraries.Reusable_Actions_Loggers;

public class Google_Search_HTML_Report {

    // declare the local driver outside so that it can be a reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        // define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);

    }// end of before suite annotation

    // Test case 1: navigate to google and enter a key word on the search field
    @Test(priority= 1)
    public void SearchforKeyword(){
        logger = reports.startTest("Search for a keyword");
        driver.navigate().to("https://www.google.com");

        // Enter a keyword on the search field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name = 'q']","BMW",logger, "Search Field");
        // Submit the go button
        Reusable_Actions_Loggers.submitAction(driver,"//*[@name='btnK']",logger," google search button");

        // end the logger per test
        reports.endTest(logger);

    }// end of test 1

    /* dependsOnMethods used when following @Test is dependent on previous @test method. Then if the first test fails,
    then the dependent test will get skipped

     */
    @Test (dependsOnMethods = "SearchforKeyword")
    public void CaptureSearchNumber(){
        logger= reports.startTest("Capture the search number");

        // Capture Search Result
        String result = Reusable_Actions_Loggers.getTextAction(driver,"//*[@id='result-stats']",logger,"Search Result Text");
        // Split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO, "search number is"+arrayResult[1]);


        reports.endTest(logger);

    }// end of test 2

    @AfterSuite
    public void quitSession() {
        driver.quit();
        reports.flush();
    }//end of after suite





}// end of class
