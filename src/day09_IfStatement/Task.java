package day09_IfStatement;

public class Task {
    public static void main(String[] args) {

        int n1 = 1, n2=5;

        if(n1>n2){
            System.out.println(n2+" is minimum number");
        }else{
            System.out.println(n1+" is minimum number");
        }

        System.out.println("----------------------------------------");

        int age = 12;


        if(age>18){
            System.out.println(age + " years old is eligible.");
        }else{
            System.out.println(age + " years old is not eligible.");
        }

        int year = 19;
        String citizen = "UK";

        boolean isEligibleToVote = (year>=18) && (citizen=="USA"|| citizen=="UK");

        if (isEligibleToVote){
            System.out.println("Person is eligible to vote.");
        }else {
            System.out.println("Person is not eligible to vote.");

        }
    }
}
/*
1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote
 */