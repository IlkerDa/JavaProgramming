package day08_IfStatement;

public class Task1 {
    public static void main(String[] args) {
        byte age = 10;

        boolean isEligible = age>=18;


        if(isEligible){
            System.out.println("Age "+ age+ " can buy cigarette.");
        }
        if (!isEligible){
            System.out.println("Age "+ age+ " cannot buy cigarette.");
        }



    }



}

/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */