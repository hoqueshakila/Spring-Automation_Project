package Action_Item;

import java.util.ArrayList;

public class Automation_AI01 {
    public static void main(String[] args) {
// Using String country & int countryCode with for loop and Array list
        // Array list using String-countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("Japan");
        countries.add("South Korea");
        countries.add("Nepal");
        // Array list using int-countryCode
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(880);
        countryCode.add(81);
        countryCode.add(82);
        countryCode.add(977);
        // For loop
        for(int i=0;i<countries.size();i++) {

            System.out.println("My country is "+countries.get(i)+ " and my country code is +" + countryCode.get(i));


        }//end of loop





    }//end of main


}//End of Class
