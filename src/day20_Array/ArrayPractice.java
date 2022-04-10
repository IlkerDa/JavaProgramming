package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // store tech elements 10 20 50 70
        int [] numbers ={10, 20, 50,70};// size 4

        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------------------");
        // create a variable that can contain 5 scores

        int[] scores = new int[5];// [0, 0, 0, 0, 0]
        scores[1]= 85;
        scores[scores.length-1] = 95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));
        System.out.println("----------------------------------------");

        String[] monts=  {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

      //  System.out.println(monts[0]);

        for (int i = 0; i < monts.length; i++) {

            System.out.print(monts[i]+" ");
        }

        System.out.println("----------------------------------------");

        for (int i = monts.length-1; i >=0 ; i--) {
            System.out.println(monts[i]);

        }



    }
}
