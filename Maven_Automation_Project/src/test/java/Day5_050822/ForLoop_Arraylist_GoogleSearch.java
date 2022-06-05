package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_Arraylist_GoogleSearch {
    public static void main (String[] args) throws InterruptedException {
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

        //Array & forloop
        ArrayList<String> Cities = new ArrayList<>();

        // List
        Cities.add("Brooklyn");
        Cities.add("Bronx");
        Cities.add("Queens");

        //Forloop
        for(int i = 0; i< Cities.size(); i++) {


            // go to google home page
            driver.navigate().to("https://www.google.com");
            Thread.sleep(3000); //3 second wait on the web browser

            // maximize the driver
            driver.manage().window().fullscreen(); // for windows use window().fullscreen();

            // locate element
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Cities.get(i));

            // submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            // capture the google search & print it
            String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
            System.out.println("Result is  " + searchResult);

            // extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            //String replacePeranth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My city is " + " "+ Cities.get(i) + " "+arrayResult[1]);

        }// end of forloop

        // Quit the driver
        driver.quit();



    }// end of main


}// end of class
