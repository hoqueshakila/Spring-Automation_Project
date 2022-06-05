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

public class Boolean_With_Checkbox {
    // declare the local driver outside so that it can be a reusable with other annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();

    }// end of before suite annotation

    @Test
    public void Yahoo_Stay_Signed_In_Checkbox_Verification()  {
        // navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        // Click on sign in
        Reusable_Actions.clickAction(driver,"//*[text()='Sign in']","Sing in");


        // Verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver,10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();

        System.out.println("Is element checked? " + elementState);



    }// end of test

    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite

}// end of class
