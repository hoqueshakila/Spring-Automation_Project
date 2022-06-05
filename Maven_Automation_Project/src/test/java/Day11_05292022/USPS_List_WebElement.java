package Day11_05292022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusable_libraries.Reusable_Actions;

import java.util.List;

public class USPS_List_WebElement {
    // declare the local driver outside so that it can be a reusable with other annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();

    }// end of before suite annotation

    @Test
    public void USPS_Tabs_Count() throws InterruptedException {
        // navigate to usps
        driver.navigate().to("https://www.usps.com");
        // declare explicit wait for the tabs
        WebDriverWait wait = new WebDriverWait(driver, 15);
        // store the navigation tabs as list to get the count
        List<WebElement> tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));

        // print the tab count

        Thread.sleep(1500);
        for (int i = 0; i <tabsCount.size();i++){
            System.out.println("Tabs count is " + tabsCount.size());
            driver.navigate().to("https://www.usps.com");
            //Thread.sleep(1500);
            tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheade')]")));
            // click on the tab
            tabsCount.get(i).click();


        }// end of loop

    }// end of test

    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite


}// end of class
