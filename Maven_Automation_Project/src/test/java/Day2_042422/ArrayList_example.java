package Day2_042422;

import java.util.ArrayList;

public class ArrayList_example {
    public static void main(String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Spain");
        countries.add("Pakistan");

        // I want to print 4th value from the list
        System.out.println("My country is "+countries.get(3)+" and my third country is "+countries.get(2));



    }// end of main method



}//end of java class
