package Day2_042422;

public class WhileLoop {
    public static void main(String[] args) {
        // iterate through zipcode and it's sreetNumber using liner array and while loop`````
        String[] zipcode = new String[]{"11218","11219","11230","11417"};
        int[] houseNumber = new int[]{111,222,333,444};

        // initialize your starting point before calling while loop
        int i = 0;

        // define the end point in while loop
        while (i< houseNumber.length){
            System.out.println("My zipcode is "+ zipcode[i]+ " house number" + houseNumber[i]);

            // incrementing
            i=i+1;
            //or i++

        }


    }// end of main

}//end of class
