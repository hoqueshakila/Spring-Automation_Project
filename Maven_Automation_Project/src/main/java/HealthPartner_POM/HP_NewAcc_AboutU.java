package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_NewAcc_AboutU extends Reusable_Annotations_Class {
    ExtentTest logger;

    public HP_NewAcc_AboutU(WebDriver driver){
        // Page Factory function for page object
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations_Class.logger;
    }// End of constructor

    // Define all the webelements using @find by concept
    @FindBy (xpath = "//*[@id='id-input']")
    WebElement InsuranceID_Input;
    @FindBy(xpath = "//*[@id='first-name-input']")
    WebElement FirstName_Input;
    @FindBy(xpath = "//*[@id='last-name-input']")
    WebElement LastName_Input;
    @FindBy(xpath = "//*[@id='dob-input']")
    WebElement DOB_Input;
    @FindBy(xpath = "//*[@id='zip-input']")
    WebElement ZipCode_Input;
    @FindBy(xpath = "//*[@id='next-btn']")
    WebElement ClickContinue;
    @FindBy(xpath = "//*[@class='messagecontent']")
    WebElement Get_Error;





    //Method
    public void Insurance_ID(String userValue){
      Reusable_Actions_POM_Loggers.sendKeysAction(driver, InsuranceID_Input,userValue,logger," Enter Insurance ID");

    }// end of Insurance ID Input

    public void FirstName(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, FirstName_Input,userValue,logger," First name ");
    }// end of First Name  Input

    public void LastName(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, LastName_Input,userValue,logger," Last name ");
    }// end of Last Name  Input

    public void DOB(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, DOB_Input,userValue,logger," DOB");
    }// end of DOB Input

    public void ZipCode(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,ZipCode_Input,userValue,logger, " ZipCode");
    }// end of ZipCode

    public void Continu(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ClickContinue,logger, " ClickContinue");
    }// end of clicking continue

    public void Error_Message(){
     String ErrorMessage =   Reusable_Actions_POM_Loggers.getTextAction(driver,Get_Error,logger, " Error Message");
        System.out.println("Error message: "+ErrorMessage);
    }// end of clicking continue





}// End of Class
