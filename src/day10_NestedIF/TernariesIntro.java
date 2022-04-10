package day10_NestedIF;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 101;


        if (n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("-------------------------------------");

        String result1 = (n%2==0)? " Even" :"Odd";
        System.out.println("result1 = " + result1);

        System.out.println("-------------------------------------");

        int age = 3;

        String result2 = age>=21 ? "Eligible" : " Not Eligible";

        System.out.println("result2 = " + result2);
        System.out.println(age>=21 ? "Eligible" : " Not Eligible");

        System.out.println("-------------------------------------");


        int number =0;
/*
        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negaive");
        }else {
            System.out.println("Zero");
        }
        
 */
        String result4 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println("result4 = " + result4);
        


    }
}
