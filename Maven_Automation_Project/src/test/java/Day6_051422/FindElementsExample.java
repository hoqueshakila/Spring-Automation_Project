package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        // go to bing.com , click on second element of the links by using class and index

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

        // navigate to bing home
        driver. navigate().to ( "http://www.bing.com");
        Thread.sleep(3000);

        // click on the image using class property with index of 1
        // to ignore white space in the property value we can use contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();





    }// end of main



}// end of class
