package Day3_043022;

import reusable_libraries.ReusableMethods_1;

public class TestingMethods {


    public static void main(String[] args) {
        // call the add two number method and execute it
        ReusableMethods_1.addTwoNumbers(20, 30);


        // cal the return method and store it in a variable to perform something else
        int finalResult = ReusableMethods_1.subtractTwonumbers(50, 10);
        int newresult = finalResult + 10;

        System.out.println("new result is" + newresult);

    }// end of main
}// end of class