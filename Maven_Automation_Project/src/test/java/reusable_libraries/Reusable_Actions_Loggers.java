package reusable_libraries;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Actions_Loggers {

    // set a static timeout variable so it can cover all explicit for all methods
    public static int timeout = 15;

    // reusable function for webdriver as a return method
    public static WebDriver setDriver(){
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }// end of set driver method

    // Create a mouse hover method
    public static void mouseHover(WebDriver driver, String xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions actions = new Actions(driver);

        try{

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS, "Successfully submit on element"+element);

        }catch (Exception e){
        System.out.println("Unable to hover on element" + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to hover on element" + elementName + " " + e);
        }

    }// end of mouse hover method


    //create a click method
    public static void clickAction(WebDriver driver,String xpath,ExtentTest logger, String elementName){
       //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS,"Successfully submit on element"+element);

        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e );
        }
    }//end of clickAction

    //create a Submit method
    public static void submitAction(WebDriver driver,String xpath, ExtentTest logger, String elementName){
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS,"Successfully submit on element"+element);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element"+ elementName + " "+e);

        }
    }//end of SubmitAction

    //create a sendkeys method
    public static void sendKeysAction(WebDriver driver,String xpath, String userValue,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS,"Successfully enter user value on element "+elementName);

        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element"+elementName+" "+e);
        }
    }//end of sendkeys method


    //create a getText method
    public static String getTextAction(WebDriver driver,String xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = null;
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            logger.log(LogStatus.PASS, "Successful capture text on element" + elementName);

        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element "+ elementName+" "+e);
        }
        return result;
    }//end of getTextAction method




    }//end of reusable action class
