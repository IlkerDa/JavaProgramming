package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask the user to enter an integer number

        System.out.println("Enter an integer");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();

        System.out.println("Enter a string");
        String str = input.next();

        input.close();


    }
}
