package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Automation_AI03 {
    public static void main(String[] args) throws InterruptedException {
    // Set up chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        // Define the webdriver
        WebDriver driver = new ChromeDriver();

        //Array & forloop
        ArrayList<String> Search = new ArrayList<>();

        // List
        Search.add("Country");
        Search.add("State");
        Search.add("Cities");

        //Forloop
        for(int i = 0; i< Search.size(); i++) {


            // go to bing.com
            driver.navigate().to("https://www.bing.com");

            //4 second wait on the web browser
            Thread.sleep(4000);

            // maximize the driver
            driver.manage().window().fullscreen();

            // locate the element
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Search.get(i));

            // Submit on bing search
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            //4 second wait on the web browser
            Thread.sleep(4000);

            // capture the google search & print it
            String searchresult = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            // System.out.println("Result is " + searchresult);

            // extract out the number and print the search number only
            String[] arrayResult = searchresult.split(" ");
            System.out.println("My bing search result for " + Search.get(i)+ " " +"is" + " " + arrayResult[0]);


        }// end of loop



        // Quit the driver
        driver.quit();


    }// end of main




}// end of class
