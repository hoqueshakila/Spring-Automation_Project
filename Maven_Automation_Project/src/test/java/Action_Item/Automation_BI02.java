package Action_Item;

import java.util.ArrayList;

public class Automation_BI02 {
    public static void main(String[] args) {
        //Array, loop & condition
// Array- Cities= Brooklyn, Queens, Manhattan, Staten
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten");
// For loop
        for (int i=0; i<cities.size(); i++){
            if(cities.get(i)== "Brooklyn"){
                System.out.println("My city is  "+ cities.get(i));
            }else if (cities.get(i)== "Manhattan"){
                System.out.println("My city is "+cities.get(i));
            }

        }// end of loop

    }// end of main

}// end of class
