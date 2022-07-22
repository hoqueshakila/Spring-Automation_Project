package HealthPartner_POM;

import ReusableClasses.Reusable_Annotations_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HP_BaseClass extends Reusable_Annotations_Class {

    public HP_BaseClass(WebDriver driver){
        PageFactory.initElements(driver, this);

    } // end of constructor element


    // Create static reference for HealthP Home page
    public static HP_HomePage_NewAcc healthPartners_homePage(){
        HP_HomePage_NewAcc healthPartners_homePage = new HP_HomePage_NewAcc(driver);
        return healthPartners_homePage;
    }// end of healthPartner_homepage


    // Create static reference for HP Insurance Home Page
    public static HP_InsuranceHomePage healthPartners_insurance(){
        HP_InsuranceHomePage healthPartners_insurance = new HP_InsuranceHomePage(driver);
        return healthPartners_insurance;
    }// end of insurance home page



    //Create static reference for Medicare Home Page
    public static HP_MedicareHomePage healthPartner_medicareHomePage(){
        HP_MedicareHomePage healthPartner_medicareHomePage = new HP_MedicareHomePage(driver);
        return healthPartner_medicareHomePage;
    }// end of

    //Create static reference for AboutU
    public static HP_NewAcc_AboutU hp_newAcc_aboutU(){
        HP_NewAcc_AboutU hp_newAcc_aboutU = new HP_NewAcc_AboutU(driver);
        return hp_newAcc_aboutU;
    }// end of Create New Account

    //Create static reference for Medicare Page
    public static HP_MedicarePages hp_medicarePages(){
        HP_MedicarePages hp_medicarePages = new HP_MedicarePages(driver);
        return hp_medicarePages;
    }// end of medicare page

    //Create static reference for HPMedicare Cost Plan
    public static HPMC_SearchPlanList_Cost hpmc_searchPlanList_cost() {
        HPMC_SearchPlanList_Cost hpmc_searchPlanList_cost = new HPMC_SearchPlanList_Cost(driver);
        return hpmc_searchPlanList_cost;
    }// end of Medicare cost break

    //Create static reference for HP_DentalPlan
    public static HP_DentalPlan hp_dentalPlan(){
        HP_DentalPlan hp_dentalPlan = new HP_DentalPlan(driver);
        return hp_dentalPlan;
    }// End of HP dental plan













}// End of Base Class
