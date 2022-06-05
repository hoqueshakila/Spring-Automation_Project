package Day7_05152022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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

        // select start month from the dropdown
        WebElement startMonth= driver.findElement(By.xpath("//* [@name = 'param[start_month]']"));
        // define select command
        //Select dropDown= new Select(startMonth);
        // Select by visible text
       //dropDown.selectByVisibleText("Dec");

        //Clicking on dropdown and its value if the dropdown tage is not under select tage
      startMonth.click();

        // Click on the value of the start month
      driver.findElement(By.xpath("//*[text()='Jun']")).click();


        // Select loan type from the drop down
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        // Define select command
        Select loanTypeDropdown = new Select(loanType);

        // Select by visible text
        loanTypeDropdown.selectByVisibleText("FHA");






    }// end of main




}// End of Class
