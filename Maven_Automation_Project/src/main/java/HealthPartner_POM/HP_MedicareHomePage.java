package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HP_MedicareHomePage extends Reusable_Annotations_Class {
// Need to declare the extent test for each page object class
    ExtentTest logger;

    public HP_MedicareHomePage(WebDriver driver){
        // Page Factory function for page object
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations_Class.logger;

    }// End of constructor

    // Define all the webelements using @find by concept
    @FindBy(xpath = "//*[@aria-label='Medicare Advantage plans']")
    WebElement Medicare_Plan1;
    @FindBy(xpath = "//*[@aria-label='Medicare Cost plans']")
    WebElement Medicare_Plan2;
    @FindBy(xpath = "//*[@aria-label='Medicare Supplement plans']")
    WebElement Medicare_Plan3;
    @FindBy(xpath = "//*[@href='/insurance/medicare/compare-plans/medicare-cost-plans/']")
   List<WebElement> MedicareCost_Plan;
    @FindBy(xpath = "//*[@href='/insurance/medicare/compare-plans/medicare-advantage-plans/']")
    List<WebElement> MedicareAdvantage_Plan;
    @FindBy(xpath ="//*[text()='Explore our plan networks']" )
    WebElement ExploreMedcare_Network;




    //Method
    public void MedicareOption_1(){
       String medicarePlanOne =  Reusable_Actions_POM_Loggers.getTextAction(driver,Medicare_Plan1,logger,"Medicare_Plan1");
       System.out.println("Three medicare plan options are (1):"+medicarePlanOne);
    }// end of option 1
    public void MedicareOption_2(){
        String  medicarePlanTwo = Reusable_Actions_POM_Loggers.getTextAction(driver,Medicare_Plan2,logger,"Medicare_Plan2");
        System.out.println("(2): "+medicarePlanTwo);
    }// end of option 2
    public void MedicareOption_3(){
        String medicarePlanThree = Reusable_Actions_POM_Loggers.getTextAction(driver,Medicare_Plan3,logger,"Medicare_Plan3");
        System.out.println("(3): "+medicarePlanThree);
    }// end of option 3

    public void Medicare_CostPlanClick(){
        Reusable_Actions_POM_Loggers.clickAction(driver,MedicareCost_Plan.get(1) , logger," Click Medicare Cost Plan");

    }// End of medicare cost plan click
    public void Medicare_AdvantagePlanClick(){
        Reusable_Actions_POM_Loggers.clickAction(driver,MedicareAdvantage_Plan.get(0) , logger," Click Medicare Advantage Plan");

    }// End of medicare Advantage plan click

    public void Medicare_ExploreNetwork_Click(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ExploreMedcare_Network, logger," Click on explore network");

    }// End of medicare cost plan click

}//End of class
