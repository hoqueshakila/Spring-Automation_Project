package HealthPartner_POM;


import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HP_HomePage_NewAcc extends Reusable_Annotations_Class {
    // Declare the ExtentTest for each page object class
    ExtentTest logger;

    public HP_HomePage_NewAcc(WebDriver driver){

    // Page Factory function for page object
       PageFactory.initElements(driver,this);
       this.logger= Reusable_Annotations_Class.logger;
}// End of constructor

    // Define all the webelements using @find by concept
    @FindBy(xpath = "//*[@class='top-link']")
    List<WebElement> Insurance_TabClick;

    @FindBy(xpath = "//*[@aria-label='Sign in']")
    WebElement SignIn;

    @FindBy(xpath = "//*[text()='Create an account']")
    WebElement Create_NewAccount;

    @FindBy(xpath = "//*[@id='btn_next']")
    WebElement Get_Started;




    //Method
    //Go to Home page and click on Insurance tab
    public void HP_HomePage(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Insurance_TabClick.get(0),logger," Insurance Tab Click");
    }// end of insurance home

    public void Sign_In(){
        Reusable_Actions_POM_Loggers.clickAction(driver,SignIn,logger,"Click on Sign in");
    }// End of click on sign in

    public void CreateNew_Account(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Create_NewAccount,logger, " Click on create a new account");
    }// End of Click new account

    public void Start_NewAccount(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Get_Started,logger,"Click on Get Started");
    }// End of get started

}//End of Class
