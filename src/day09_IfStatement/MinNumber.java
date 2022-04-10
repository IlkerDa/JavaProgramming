package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 500, n2 = 600;

        boolean equal = n2==n1;

        if (equal){
            System.out.println(n1 +" and " + n2 + " are equal.");
        }

        boolean isMax1 = n1 > n2;

        if (isMax1){
            System.out.println( n1+ " is maximum number");
        }
        
        if (!isMax1 && !equal){
            System.out.println(n2+ " is maximum number");
        }


    }
}
/*
	3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */