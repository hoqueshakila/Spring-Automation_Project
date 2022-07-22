package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HPMC_SearchPlanList_Cost extends Reusable_Annotations_Class {
ExtentTest logger;

public HPMC_SearchPlanList_Cost(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.logger=Reusable_Annotations_Class.logger;

}// end of constructor

    // Define all the element using @Find
    @FindBy(xpath = "//*[text()=' Medicare Cost Plans']")
    WebElement ClickMedicare_CostPlan;
    @FindBy(xpath = "//*[@class='btn btn-block Spa_Style_SecondaryButton']")
    List<WebElement>PlanDetails_1st;
    @FindBy(xpath ="//*[@class='Spa_Style_H1 plan-name-header']")
    WebElement PlanName;
    @FindBy(xpath = "//*[text()=' $33.60 monthly ']" )
    WebElement Premium;
    @FindBy(xpath = "//*[text()=' $283 partial year ']" )
    WebElement Partial_Cost;
    @FindBy(xpath = "//*[text()=' $451 partial year ']")
    WebElement Partial_Cost2;
    @FindBy(xpath = "//*[@id='plan-benefits-container']")
    WebElement medicalBenefits;
    @FindBy(xpath = "//*[text()=' Total estimated costs ']")
    WebElement EstimateCost;
    @FindBy(xpath ="//*[@id='effectiveDateDropDown']" )
    WebElement SelectEffectiveDate;
    @FindBy(xpath = "//*[text()='September 2022']")
    WebElement ClickEffectiveDate;
    @FindBy(xpath = "//*[text()=' $361 ']")
    WebElement EstimatedSept;




    //Method
    public void ClickMedicareCost(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ClickMedicare_CostPlan,logger,"Click on medicare cost plan");
    }// end of medicare cost plan
    public void PlanInfo_1(){
        Reusable_Actions_POM_Loggers.clickAction(driver,PlanDetails_1st.get(0),logger,"Click First Plan details");
    }// end of plan infor 1
    public void Plan_Name(){
        String planName = Reusable_Actions_POM_Loggers.getTextAction(driver,PlanName,logger,"Plan Name");
        System.out.println("Plan name is " +planName );
    }// end of plan name
    public void Monthly_Premium(){
        String Month_Premium = Reusable_Actions_POM_Loggers.getTextAction(driver,Premium, logger,"Monthly Premium");
        System.out.println("Premium monthly cost is " + Month_Premium);
    }// end of monthly premium
    public void PartialYear_Cost (){
        String HealthStatusCost = Reusable_Actions_POM_Loggers.getTextAction(driver,Partial_Cost, logger,"Partial year cost");
        System.out.println("Partial cost is " + HealthStatusCost);
    }// end of partial year cost
    public void PartialYear_Cost2 (){
        String HealthStatusCost2 = Reusable_Actions_POM_Loggers.getTextAction(driver,Partial_Cost2, logger," 2nd Partial year cost");
        System.out.println("2nd Partial cost is " + HealthStatusCost2);
    }// end of partial year cost
    public void BenifitsDetails (){
        String Med_Benefits = Reusable_Actions_POM_Loggers.getTextAction(driver,medicalBenefits, logger,"Medical deduction");
        System.out.println("Medical deduction is " + Med_Benefits);
    }// end of partial year cost
    public void EstimatedCost (){
        Reusable_Actions_POM_Loggers.clickAction(driver,EstimateCost, logger," Estimated Cost");
    }// end of estimated cost
    public void Select_Effect_Date (){
        Reusable_Actions_POM_Loggers.clickAction(driver,SelectEffectiveDate, logger," click on effective date drop down");
    }// end of effective dates drop down
    public void Click_Effect_Date (){
        Reusable_Actions_POM_Loggers.clickAction(driver,ClickEffectiveDate, logger," Select a effective date");
    }// end of clicking effective dates
    public void Estimated_SeptemberCost (){
       String SeptemberCost =  Reusable_Actions_POM_Loggers.getTextAction(driver,EstimatedSept, logger," Select a effective date");
        System.out.println("Total september estimated cost is " + SeptemberCost);
    }// end of clicking effective dates

}// End of Class
