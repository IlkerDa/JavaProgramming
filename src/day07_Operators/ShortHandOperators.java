package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assingnment

        int number = 100;

        System.out.println("number = " + number);

        number = 200;

        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word);

        word += 1;

        System.out.println("word = " + word);

        //Addition Assignment
        int x = 100;

        System.out.println("x = " + x);
        System.out.println(x + 200);//300
        System.out.println("x = " + x);

        // x = x+200;
        x += 200;
        System.out.println("x = " + x);
        System.out.println("------------------------------------------------------------");

        String str = "Wooden";

        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1);


        double availableBalance = 1000.50;
        //deposit 300$

        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("------------------------------------------------------------");

        // withdrawing 500$

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);


        // withdrawing 200, then depositing 400 $

        availableBalance -= 200; // 600.5
        availableBalance += 400; //1000.5
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("------------------------------------------------------------");

        double salary = 50000.5;
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.0001;
        dodge *= 10000000;
        System.out.println("dodge = " + dodge);
        System.out.println("------------------------------------------------------------");


        double num2 = 25000;
        num2 /= 1000;
        System.out.println("num2 = " + num2);
        System.out.println("------------------------------------------------------------");


        double num3 = 100;
        // %= 
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("------------------------------------------------------------");


        int amount = 127; //cents
        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------------------------------------------");

        int cents2 = 127;
        cents2 %= 25;   // cents2 = cents2 % 25;
        System.out.println("cents2 = " + cents2);
        System.out.println("------------------------------------------------------------");


        int y = 300;
        y %= 16;
        System.out.println("y = " + y);
        System.out.println("------------------------------------------------------------");


        int balance = 3500;

        balance %= 153;
        System.out.println("balance = " + balance);
        System.out.print(balance);
        System.out.println(balance);

        
        
        int a = 'A';
        System.out.println("a = " + a);

    }
}
