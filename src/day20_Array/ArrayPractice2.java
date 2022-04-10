package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];

       // letters[0]='A';
       // letters[1]='B';


      /*  for (char i = 'A', j=0; i <='Z'&&j<letters.length ; i++, j++) {

            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters));
/*

       */

        for (int i = 0, j='A'; i < letters.length ; i++,j++) {
            letters[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------------------");

        char [] letters2 = new char[26];

        char ch2 = 'Z';
        for (int i = 0; i < letters2.length; i++) {
            letters2[i]=ch2--;

        }
        System.out.println(Arrays.toString(letters2));


    }
}
