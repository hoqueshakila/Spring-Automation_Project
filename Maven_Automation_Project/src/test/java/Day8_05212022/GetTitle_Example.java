package Day8_05212022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle_Example {
    public static void main(String[] args) {
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



        // navigate to google
        driver.navigate().to("https://www.google.com/");

        // capture the title of the page and compare it with your expected title 'Google'
        String actualTitle= driver.getTitle();
        if (actualTitle.equals("Google")){
            System.out.println("My title matches");
        }else {
            System.out.println("Title doesn't match. Actual title is"+actualTitle);
        }


    }// end of main
}// of class
