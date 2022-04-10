package day08_IfStatement;

public class SwapTwoVariables_WithTemproraryVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("---------------------------------------------");

        int c = a; // c = 10

        a = b; // a=15

        b= c;



        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
