package day15_ForLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");

        String str = scan.next();
        String result = "";

        for (int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);
            
        }

        scan.close();

        System.out.println("result = " + result);
  }
}
