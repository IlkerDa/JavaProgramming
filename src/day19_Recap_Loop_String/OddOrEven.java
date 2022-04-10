package day19_Recap_Loop_String;

import day17_While_DoWhile.WhileLoopIntro;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter a number");
            int num1= scan.nextInt();

            if (num1%2==0){
                System.out.println("even number");
            }else{
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next();

            if (a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no")){

                System.err.println("Invalid Entry");
                System.exit(0);

                if(a.equalsIgnoreCase("no")){
                    System.out.println("thank you");
                    break;
                }

            }
            scan.close();

        }
    }
}
