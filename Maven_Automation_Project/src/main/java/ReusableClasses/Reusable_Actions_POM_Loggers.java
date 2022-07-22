package ReusableClasses;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class Reusable_Actions_POM_Loggers {

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
    public static void mouseHover(WebDriver driver, WebElement xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions actions = new Actions(driver);

        try{

            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS, "Successfully submit on element"+elementName);

        }catch (Exception e){
        System.out.println("Unable to hover on element" + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to hover on element" + elementName + " " + e);
            getScreenShot(driver,elementName, logger);
        }

    }// end of mouse hover method


    //create a click method
    public static void clickAction(WebDriver driver,WebElement xpath,ExtentTest logger, String elementName){
       //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            //after the LogStatus.PASS,"Details" + elementName. not Element, if you use element ,it will give you xpath as line 62 element. 😱 👍
            logger.log(LogStatus.PASS,"Successfully submit on element"+ elementName);

        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e );
            getScreenShot(driver,elementName, logger);
        }
    }//end of clickAction

    //create a Submit method
    public static void submitAction(WebDriver driver,WebElement xpath, ExtentTest logger, String elementName){
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.submit();
            logger.log(LogStatus.PASS,"Successfully submit on element"+elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element"+ elementName + " "+e);
            getScreenShot(driver,elementName, logger);

        }
    }//end of SubmitAction

    //create a sendkeys method
    public static void sendKeysAction(WebDriver driver,WebElement xpath, String userValue,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS,"Successfully enter user value on element "+elementName);

        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element"+elementName+" "+e);
            getScreenShot(driver,elementName, logger);
        }
    }//end of sendkeys method


    //create a getText method
    public static String getTextAction(WebDriver driver,WebElement xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = null;
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            result = element.getText();
            logger.log(LogStatus.PASS, "Successful capture text on element" + elementName);

        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element "+ elementName+" "+e);
            getScreenShot(driver,elementName, logger);
        }
        return result;
    }//end of getTextAction method

    // Verify title

    public static void VerifyTitleAction (WebDriver driver,ExtentTest logger,  String ActualTitle){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try {
            String title = driver.getTitle();
            if (title.contains(ActualTitle)) {
                System.out.println("My title matches. Actual title is " + title);
                logger.log(LogStatus.PASS, "Successfully captured title "+ ActualTitle);
            } else {
                System.out.println("My title does not match. Actual title is " + title);
                logger.log(LogStatus.PASS, "Successfully captured title "+ ActualTitle);
            }// end of condition
        }catch (Exception e){
            System.out.println("Unable to print title " + e);
            logger.log(LogStatus.FAIL, "Unable to capture title "+ "actual title is, " +ActualTitle+ e);

        } // end of try & catch
    }// end of method


    //Switch Tab By index
    public static void switchTabIndex(WebDriver driver,ExtentTest logger, int index) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(index));
            logger.log(LogStatus.PASS, "Successfully switched tab ");
        } catch (Exception e) {
            System.out.println("Unable to switch tav " + e);
            logger.log(LogStatus.FAIL, "Unable to switch tab " + e);
        }
    }// End of switch tab

    // Scroll By Pixel
    public static void scrollByPixel(WebDriver driver,ExtentTest logger, String pixel) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript(pixel);
            logger.log(LogStatus.PASS, "Successfully scrolled by pixel");
        } catch (Exception e) {
            System.out.println(" Unable to scroll " + e);
            logger.log(LogStatus.FAIL, "Unable to scrolled by pixel "+ e);
        }
    }// end of scrolling by pixel

    // Select by Text
    public static void selectbytextAction(WebDriver driver, WebElement xpath, String visibleText,ExtentTest logger ,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(visibleText);
            logger.log(LogStatus.PASS, "Successfully selected the text "+ elementName);

        } catch (Exception e) {
            System.out.println("Unable to select a element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to select text "+ elementName +" "+e);
            getScreenShot(driver,elementName, logger);
        }
    }//end of Select method

    // scroll to new element by locator
    public static void scrollToElement(WebDriver driver, WebElement xpath,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
            logger.log(LogStatus.PASS,"successfully scroll to element"+elementName);
        } catch (Exception e) {
            System.out.println(" Unable to scroll to element " + e);
            logger.log(LogStatus.FAIL,"Unable to scroll to element" + elementName);
            getScreenShot(driver,elementName, logger);
        }
    }// end of scroll to element

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            e.printStackTrace();

        }
    }//end of getScreenshot method



    }//end of reusable action class
