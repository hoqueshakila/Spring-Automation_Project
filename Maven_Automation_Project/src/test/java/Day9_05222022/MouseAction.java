package Day9_05222022;

import com.sun.tools.javac.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseAction {
    public static void main(String[] args) throws InterruptedException {
        // Setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver(). setup();

        // Set Chrome option argument
        ChromeOptions Options = new ChromeOptions();

        // set the condition to incognito mode
        Options.addArguments("incognito");

        // set the condition to maximize/ fullscreen your driver
        // Options.addArguments("start-maximized");

        // Setting your driver as headless (running on background)
        //Options.addArguments("headless");

        // for mac use full screen
        Options.addArguments("start-fullscreen");

        // define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(Options);

        // navigate to the home page
        driver.navigate().to( "https://www.usps.com");
        Thread.sleep(2000);

        // declare and define mouse actions
        Actions mouseActions = new Actions(driver);

        // hover to send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        mouseActions.moveToElement(sendTab).perform();

        // clicking on tracking using mouse action
        WebElement tracking = driver.findElement (By.xpath("//*[text()='Tracking']"));
        mouseActions.moveToElement(tracking).click().perform();

        Thread.sleep(2000);
        //type a invalid tracking number using send key with mouse actions
        WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        mouseActions.moveToElement(trackingField).click().perform();
        mouseActions.moveToElement(trackingField).sendKeys("111234243242").perform();




    }//end of main

}// end class
