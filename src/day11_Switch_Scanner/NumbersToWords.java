package day11_Switch_Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        int n = 99;
        String result = (n >=0 &&n<=9)?

                (n==0)? "Zero" :(n==1)? "One" :(n==2)? "Two" :(n==3)? "Three"
                        :(n==4)? "Four" :(n==5)? "Five" :(n==6)? "Six" :(n==7)? "Seven"
                        :(n==8)? "Eight" : "Nine"

                        : "Invalid Number";

        System.out.println("result = " + result);


    }
}
