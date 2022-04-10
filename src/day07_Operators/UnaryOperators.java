package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1<0); //false
        System.out.println(num2<0); //true

        int a = 5;
        ++a; // pre incremet: increases the value by 1 right away
        System.out.println(+a);

        --a; // pre decrement: decreases the value by 1 immediately

        System.out.println("------------------------------------------------------------");

        int b= 100;
        System.out.println(++b); // pre increment

        int c = 100;
        System.out.println(c++); //100 post increment first passes the current value then increases by 1
        System.out.println(c); // 101

        System.out.println("------------------------------------------------------------");

        int x = 200;
        System.out.println(--x); // 199 pre increment

        int y = 200;
        y--;
        System.out.println(y--); // postdecrement
        System.out.println(y);
        System.out.println("------------------------------------------------------------");

        int z= 45;
        System.out.println(++z); //46, z=46
        System.out.println(z++); //46 z= 47
        System.out.println(z); //47


    }
}
