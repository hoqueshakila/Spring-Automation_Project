package HealthPartner_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HP_MedicarePages extends Reusable_Annotations_Class {
    ExtentTest logger;

    public HP_MedicarePages(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Reusable_Annotations_Class.logger;
    }// End of constructor

    // Define all the element using @find
    @FindBy(xpath = "//*[@href='/insurance/medicare/compare-plans/medicare-cost-plans/minnesota/']")
    List<WebElement>Select_Minnesota;
    @FindBy(xpath = "//*[text()='Compare plans and pricing']")
    WebElement Compare_PlanPricing;
    @FindBy(xpath = "//*[@id='demographic_input']")
    WebElement Enter_ZipCode;
    @FindBy(xpath = "//*[text()=' Pine, MN']")
    WebElement County;
    @FindBy(xpath = "//*[text()=' View plans ']")
    WebElement SubmitZipcode;

    @FindBy(xpath = "//*[@href='/insurance/medicare/compare-plans/medicare-advantage-plans/wisconsin/'] ")
    List<WebElement>Select_Wisconsin;

    @FindBy(xpath = "//*[text()=' Robin Medicare Advantage plans ']")
    WebElement WisconsinMedicarePlan;
    @FindBy(xpath = "//*[text()='Robin Birch, Robin Maple']")
    WebElement SubPlan_Robin;
    @FindBy(xpath = "//*[@class='columns-xs-1 columns-sm-2 columns-md-4 columns-lg-4 gutter-none hydrated']")
    WebElement CountiesAvailable;


    // Method
    public void Minnesota_Click(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Select_Minnesota.get(1),logger,"Select Minnesota State");
    }// end of selecting minnesota state
    public void Compare_Plan_Pricing(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Compare_PlanPricing,logger," Compare Minnesota Medicare Plan & Pricing");
    }// end of compare plan & pricing
    public void ZipCode(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, Enter_ZipCode,userValue,logger," Enter ZipCode");
    }// End of Zipcode
    public void Get_CountyName(){
       String County_Name= Reusable_Actions_POM_Loggers.getTextAction(driver,County,logger," Get County Name");
        System.out.println("County for zipcode 55036 is "+County_Name);
    }// County Name
    public void Submit_ZipCode(){
        Reusable_Actions_POM_Loggers.clickAction(driver,SubmitZipcode,logger," Enter view plan");
    }// end of submitting zipcode

    public void Wisconsin_Click(){
        Reusable_Actions_POM_Loggers.clickAction(driver,Select_Wisconsin.get(1),logger,"Select Wisconsin State");
    }// end of selecting Wisconsin state

    public void MedPlan_Wisconsin(){
        String WisconsinMedPlan_Name= Reusable_Actions_POM_Loggers.getTextAction(driver,WisconsinMedicarePlan,logger," Plan Name");
        System.out.println("Name of the Wisconsin plan =  "+WisconsinMedPlan_Name);
    }// Medi plan Name

    public void SubPlan_Wisconsin(){
        String SubPlan_Name= Reusable_Actions_POM_Loggers.getTextAction(driver,SubPlan_Robin,logger," Robin Sub Plan Name");
        System.out.println("Two sub-plan under Robin = " + SubPlan_Name);
    }// Medi sub plan Name

    public void Counties_Wisconsin(){
        String Counties_Name= Reusable_Actions_POM_Loggers.getTextAction(driver,CountiesAvailable,logger," Available counties ");
        System.out.println("Sub-Plan offered in these counties = " + Counties_Name);
    }// Subplan counties


}// End of Class
