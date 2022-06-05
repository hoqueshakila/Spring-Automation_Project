package Day6_051422;

import com.sun.tools.javac.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_mortgagecal {

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

        // Navigate mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        // click clear and enter new value on Home value field
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();

        //Thread.sleep(1500);
        homeValue.sendKeys("450000");

        //click on % radio button
        driver.findElement(By.xpath("//*[@value='percent']")).click();

        // Click, Clear and enter new data on down payment field

        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));

       downPayment.click();
       downPayment.clear();
       downPayment.sendKeys("5");





    }// end of Main



}// End of Class
