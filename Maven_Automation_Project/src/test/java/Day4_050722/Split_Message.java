package Day4_050722;

public class Split_Message {
    public static void main(String[] args) {
        // declare string variable
        String splitMessage = " My name is john";
        // declaring an array of string to store the string split
        String[] splitMessageArray = splitMessage.split ("s");

        // print john
        System.out.println("My first name is " + splitMessageArray[1]);



    }// end of main



}// end of class
