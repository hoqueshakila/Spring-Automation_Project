package Day7_05152022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FedilisCare_Tab {
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
       // Options.addArguments("start-fullscreen");

        // define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(Options);

        // Navigate mortgagecalculator site
        driver.navigate().to("https://www.fideliscare.org/");
        Thread.sleep(3000);

        // click on shop for a plan
        // we are clicking on index 0 because there are two elements for this xpath
        driver.findElements(By.xpath("//*[text() ='Shop For a Plan']")).get(0).click();
        // Wait a bit for page to load
        Thread.sleep(3000);

        //Click on search under find a doctor card
        driver.findElements(By.xpath("//*[@href='/Shop-for-a-Plan']")).get(0).click();
        // Wait a bit for page to load
        Thread.sleep(2000);

        // click on search under find a dr card
        driver.findElement(By.xpath("//*[@href= '/findadoctor']")).click();
        // Wait a bit for page to load
        Thread.sleep(1000);

        //Store new tabs in an array list, we use getWindowhandles method to get list of tabs
       ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to new tab, it should be at 1
        driver.switchTo().window(tabs.get(1));

        // click on new search button
        driver.findElement(By.xpath("//*[@class = 'fal fa-search-plus']")).click();

        //Wait a bit for page to load
        Thread.sleep(1000);

         //Close the new tab
        driver.close();

        //switch back to the default tab
       driver.switchTo().window(tabs.get(0));

        //then click on providers card
        driver.findElement(By.xpath("//*[@class = 'fal fa-stethoscope fa-fw']")).click();
        //Wait a bit for page to load
       Thread.sleep(1000);

     // close the new tab
     driver.close();




    }// end of main




}// end of class
