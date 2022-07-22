package Action_Item;

import HealthPartner_POM.HPMC_SearchPlanList_Cost;
import HealthPartner_POM.HP_BaseClass;
import ReusableClasses.Reusable_Actions_Loggers;
import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import org.testng.annotations.Test;

public class Automation_AI08_TestHP_POM extends Reusable_Annotations_Class {

    @Test(priority = 2)
    public void AllMedicarePlan() throws InterruptedException {

        driver.navigate().to("https://www.healthpartners.com/");

        Reusable_Actions_POM_Loggers.scrollByPixel(driver,logger,"0,400");
        Thread.sleep(2000);

        HP_BaseClass.healthPartners_homePage().HP_HomePage();
        Thread.sleep(2000);

        HP_BaseClass.healthPartners_insurance().MedicarePlan_TabClick();
        Thread.sleep(2000);

        Reusable_Actions_POM_Loggers.scrollByPixel(driver, logger, "0,550");
        Thread.sleep(2000);

        HP_BaseClass.healthPartner_medicareHomePage().MedicareOption_1();
        HP_BaseClass.healthPartner_medicareHomePage().MedicareOption_2();
        HP_BaseClass.healthPartner_medicareHomePage().MedicareOption_3();
        //Print
//        HP_BaseClass.healthPartner_medicareHomePage().PrintMedicare_Options();


    }//End of test 1

    @Test(priority = 1)
    public void CreateNewOnlineAccount()throws InterruptedException{
        driver.navigate().to("https://www.healthpartners.com/");

        HP_BaseClass.healthPartners_homePage().Sign_In();
        Thread.sleep(3000);
        HP_BaseClass.healthPartners_homePage().CreateNew_Account();
        Thread.sleep(2000);
        HP_BaseClass.healthPartners_homePage().Start_NewAccount();
        Thread.sleep(2000);
        HP_BaseClass.hp_newAcc_aboutU().Insurance_ID("XYZ123");
        HP_BaseClass.hp_newAcc_aboutU().FirstName("Shakila");
        HP_BaseClass.hp_newAcc_aboutU().LastName(" Hoque");
        HP_BaseClass.hp_newAcc_aboutU().DOB(" 05/01/1995");
        HP_BaseClass.hp_newAcc_aboutU().ZipCode("55036");
        HP_BaseClass.hp_newAcc_aboutU().Continu();
        HP_BaseClass.hp_newAcc_aboutU().Error_Message();

    }// End of test 2

    @Test(priority = 3)
    public void medicareBreakdownCost () throws InterruptedException{
        driver.navigate().to("https://www.healthpartners.com/insurance/");
        Thread.sleep(3000);
        Reusable_Actions_POM_Loggers.scrollByPixel(driver, logger, "0,550");
        Thread.sleep(2000);
        HP_BaseClass.healthPartners_insurance().MedicarePlan_TabClick();
        Thread.sleep(3000);
        Reusable_Actions_POM_Loggers.scrollByPixel(driver, logger, "0,550");
        Thread.sleep(2000);
        HP_BaseClass.healthPartner_medicareHomePage().Medicare_CostPlanClick();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().Minnesota_Click();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().Compare_Plan_Pricing();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().ZipCode("55036");
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().Get_CountyName();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().Submit_ZipCode();
        Thread.sleep(3000);
        HP_BaseClass.hpmc_searchPlanList_cost().ClickMedicareCost();
        Thread.sleep(3000);
        HP_BaseClass.hpmc_searchPlanList_cost().PlanInfo_1();
        Thread.sleep(3000);
        HP_BaseClass.hpmc_searchPlanList_cost().Plan_Name();
        HP_BaseClass.hpmc_searchPlanList_cost().Monthly_Premium();
        HP_BaseClass.hpmc_searchPlanList_cost().PartialYear_Cost();
        HP_BaseClass.hpmc_searchPlanList_cost().PartialYear_Cost2();
        HP_BaseClass.hpmc_searchPlanList_cost().BenifitsDetails();
        HP_BaseClass.hpmc_searchPlanList_cost().EstimatedCost();
        HP_BaseClass.hpmc_searchPlanList_cost().Select_Effect_Date();
        HP_BaseClass.hpmc_searchPlanList_cost().Click_Effect_Date();
        HP_BaseClass.hpmc_searchPlanList_cost().Estimated_SeptemberCost();

    }// End of test 3

    @Test(priority = 4)
    public void ProviderLocations () throws InterruptedException{
        driver.navigate().to("https://www.healthpartners.com/insurance/medicare/");
        HP_BaseClass.healthPartner_medicareHomePage().Medicare_AdvantagePlanClick();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().Wisconsin_Click();
        Thread.sleep(2000);
        HP_BaseClass.hp_medicarePages().MedPlan_Wisconsin();
        HP_BaseClass.hp_medicarePages().SubPlan_Wisconsin();
        HP_BaseClass.hp_medicarePages().Counties_Wisconsin();
    }// End of test 4

    @Test(priority = 5)
    public void EmployerDentalPlanSlotTab() throws InterruptedException{
        driver.navigate().to("https://www.healthpartners.com/insurance/");
        Thread.sleep(3000);
        HP_BaseClass.healthPartners_insurance().DentalPlan_TabClick();
        Thread.sleep(2000);
        HP_BaseClass.hp_dentalPlan().Explore_employerDental();
        HP_BaseClass.hp_dentalPlan().Select_Minnesota();
        HP_BaseClass.hp_dentalPlan().Large_Group();
        HP_BaseClass.hp_dentalPlan().Indiv_Fam();
        HP_BaseClass.hp_dentalPlan().Print_slot();


    }//End of test 5






}//end of POM Test


