package day05_Concetenation;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 100;  //100 + 50 = 150
        int secondNumber = 50;
        int addition = firstNumber+secondNumber;
        int subtraction = firstNumber-secondNumber;
        int multiplication = firstNumber*secondNumber;

        System.out.println(firstNumber+" + "+secondNumber+ " = "+(firstNumber+secondNumber));
        System.out.println(firstNumber+" + "+secondNumber+ " = "+addition);//100+50=150

        System.out.println(firstNumber+ " - "+secondNumber+ " = "+ subtraction);//100-50=50

        System.out.println(firstNumber+ " * " + secondNumber+" = "+ multiplication); //100*50 =5000




    }
}
