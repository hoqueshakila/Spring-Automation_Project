package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_DentalPlan extends Reusable_Annotations_Class {
    ExtentTest logger;

    public HP_DentalPlan(WebDriver driver){
        // Page Factory function for page object
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations_Class.logger;
    }// End of constructor

    // Define all the webelements using @find by concept

    @FindBy(xpath = "//*[@heading-text='Employer dental plans']")
    WebElement Expl_EmployerDental;

    @FindBy(xpath = "//*[@heading-text='Minnesota']")
    WebElement SelectMinnesota;

    @FindBy(xpath = "//*[text()='See plans']")
    WebElement SelectLargeGroup;

    @FindBy(xpath = "//*[text()='Individual & family']")
    WebElement PlanBarOption;

    @FindBy(xpath = "//*[@active='yunup']")
    WebElement getPlanBarOption;


    // Method
    public void Explore_employerDental(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Expl_EmployerDental,logger," Click explore employer ");
    }// end of explore dental

    public void Select_Minnesota(){
        Reusable_Actions_POM_Loggers.clickAction(driver,SelectMinnesota,logger," click on Minnesota ");
    }// end of Select state

    public void Large_Group(){
        Reusable_Actions_POM_Loggers.clickAction(driver,SelectLargeGroup,logger," click on Large gorup plan");
    }// end of Large group plan

    public void Indiv_Fam(){
        Reusable_Actions_POM_Loggers.clickAction(driver,PlanBarOption,logger," click on plan bar & select Individual & family plan");
    }// end of plan bar

    public void Print_slot(){
        String PlanSlot = Reusable_Actions_POM_Loggers.getTextAction(driver,getPlanBarOption,logger," Capture plan slot");
        System.out.println("Plans available in the slot:  "+ PlanSlot);
    }// end of plan bar



}// End of Dental POM Class
