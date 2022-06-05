package Day3_043022;

public class if_else_condition {
    public static void main(String[] args) {
        // declare two integer variable
        int a = 5;
        int b = 3;

        // print when a less than b or print when it's greater/ equal to b
        if(a < b){
            System.out.println("a is less than b");
        }else{
            System.out.println("a is greater or equal to b");

        }//end of if else

        // declaration additional variable
        int d = 4;
        int e = 5;
        int f = 6;

        // or operator with if statement
        // || is used for or operator --- one of the condition need to be true only
        //&& is used for and operator --- both conditions need to be true
        if (d < e && f < e) {
            System.out.print("d is less than e or f is less than e");
        } else {
            System.out.println("condition is not true");
        }




    }//end of main
}//end of class
