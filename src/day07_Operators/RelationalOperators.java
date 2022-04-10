package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // <   <=   >   >=

        boolean result1 = 200 > 40; // false

        System.out.println(result1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;
        System.out.println("result4 = " + result4);

        //credit score

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);// if the credit score is greater than 720, the client is elible for loan

        int score = 79;

        boolean hasFailed = score <= 59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 20;
        System.out.println("result7 = " + result7);

        int x = 100;
        int y = 200;

        boolean equal = x == y;
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);

        boolean result9 = 'a' == 'A';

        System.out.println("result9 = " + result9);

        boolean result10 = 100 !=200; // true

        System.out.println("result10 = " + result10);
        
        boolean result11 = "Java" != "Break"; // true
        
        boolean result12 = 300 != 300; //false
        System.out.println("result12 = " + result12);


        
    }
}
