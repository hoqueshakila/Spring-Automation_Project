package Action_Item;

public class Automation_AI02 {
    public static void main(String[] args) {
        // Using the conditional statement create a numeric variable with name as grade with some value using that variable
        // Variable  changes each time w/ condition

        // Declaring int value 1
        int grade = 105;
        // when grade range is from 90 to 100, print grade is A
        if (grade >= 90 && grade <= 100){
            System.out.println("Grade is A");
        }
        // when grade range is from 80 to 90, print grade is B
        else if (grade >= 80 && grade < 90){
            System.out.println("Grade is B");
        }
        // when grade range is from 70 to 80, print grade is C
        else if (grade >= 70 && grade < 80){
            System.out.println("Grade is C");
        }
        // when grade range is from 60 to 70, print grade is D
        else if(grade >= 60 && grade < 70){
            System.out.println("Grade is D");
        }
        // any grade below 60 is F
        else if (grade <60){
            System.out.println("Grade is F");
        }
        // any grade over 100 is A+
        else System.out.println("Grade is A+");




    }// end of main

}// end of class
