package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();//90
       // input.nextLine(); // Enter olmasini sagliyor FARKLI DATA TYPELAR OLURSA ENTER ICIN BUNU KULLANMALISIN


        System.out.println("Enter your second score");

        int score2 = input.nextInt();


        //System.out.println("score = " + score);
      //  System.out.println("fullName = " + fullName);

        System.out.println("toplam = " + (score2+score));





    }
}
