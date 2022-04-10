package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2= 3;

        int division= num1/num2;
        int remainder = num1%num2;
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);

        System.out.println(25%5);
        System.out.println(10/3f);

        int x= 2;
        int y= x++;

        System.out.println(y);
        System.out.println(x);
        System.out.println(y);

    }
}
