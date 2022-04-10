package day16_ForLoopStringPractices;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("enter a string");

        String str = new Scanner(System.in).nextLine();
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            result += ch;
            System.out.println("result = " + result);
        }

    }
}

/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


 */