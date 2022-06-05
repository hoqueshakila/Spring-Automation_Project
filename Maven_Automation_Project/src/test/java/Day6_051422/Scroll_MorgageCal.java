package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MorgageCal {
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

        // Navigate mortgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        // Declare Javascript executor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // Scroll to pixel 400 on mortgage calc website
        //jse.executeScript("scroll(0,800)");
        // wait few second for browser to perform
       // Thread.sleep(3000);
        // Declare a weblement variable that we want to scroll into
        WebElement sharebutton =driver.findElement(By.xpath("//*[@id='share_button']"));

        // scroll into share this calculation button
        jse.executeScript("arguments[0].scrollIntoView(true);", sharebutton);

        Thread.sleep(2000);

        // Click on the share this calculation button
        sharebutton.click();
        Thread.sleep(2000);

        //scroll back up
        jse.executeScript("scroll(0,-400");
        Thread.sleep(2000);

        // quit the chrome driver
        driver.quit();



    }// end of main


}//end of class
