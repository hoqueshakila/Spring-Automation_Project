package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_InsuranceHomePage extends Reusable_Annotations_Class {
    // Declare the ExtentTest for each page object class
    ExtentTest logger;

    public HP_InsuranceHomePage(WebDriver driver){

        // Page Factory function for page object
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations_Class.logger;
    }// End of constructor

    // Define all the webelements using @find by concept
    @FindBy(xpath = "//*[@heading-text='Medicare plans']")
    WebElement MedicarePlan_TabClick;
    @FindBy(xpath = "//*[@heading-text='Dental plans']")
    WebElement DentalPlan_TabClick;






    //Method

    public void MedicarePlan_TabClick() {
        Reusable_Actions_POM_Loggers.clickAction(driver,MedicarePlan_TabClick, logger, "Medicare Section");
    }//end of click on medicare plan

    public void DentalPlan_TabClick() {
        Reusable_Actions_POM_Loggers.clickAction(driver,DentalPlan_TabClick, logger, "Dental Section");
    }//end of click on Dental plan








}//End Of Class
