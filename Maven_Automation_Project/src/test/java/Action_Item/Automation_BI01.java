package Action_Item;

public class Automation_BI01 {
    public static void main(String[] args) {
        // Using String [] region & int [] areaCode with while loop and linear array
        //Array list using String- region
        String[] region = new String[]{"Brooklyn", "Bronx", "Queens","Staten Island"};

        // Arry list using Int- areaCode
        int[] areaCode = new int[]{347,917,718,929};

        // While loop
        int i = 0;
        while (i < areaCode.length) {
            System.out.println("My region is "+ region[i]+ " and my area code is "+areaCode [i]);
            i=i+1;



        }//end of while loop


    }//End of Main

}//End of Class
