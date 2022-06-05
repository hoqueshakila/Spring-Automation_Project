package Day9_05222022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import reusable_libraries.Reusable_Actions;

import java.net.URL;

public class USPS_Reusable_Concepts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Reusable_Actions.setDriver();

        // nevigate to usps
        driver.navigate().to("https://www.usps.com");

        // hovering to the quick tools
        Reusable_Actions.mouseHover(driver, "//*[text()='Quick Tools']","Quick Tools" );

        // hovering to the send tab
        Reusable_Actions.mouseHover(driver, "//*[@id= 'mail-ship-width']", "Send Tab");

        // Click on calculate a price
        Thread.sleep(1500);
        Reusable_Actions.clickAction(driver, "//li[@class='tool-calc']", "Calculate a Price");

        // Enter Zipcode using sendkey reusable meth
        Reusable_Actions.sendKeysAction(driver,"//*[@id= 'Origin']","11218", "Zip Code");

        //Print out header text info
        String result = Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']","Header Info");
        System.out.println("My header info is " + result);

    }// end of main


}//end of class
