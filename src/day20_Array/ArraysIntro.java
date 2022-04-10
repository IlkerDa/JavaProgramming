package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a varibale that is capable enough to contain 5 names
        String myGroups[] = new String [5];
        myGroups[0]= "Gunay";
        myGroups[1]="Neria";
        myGroups[2]="Suat";
        myGroups[3]= "Hulya";
        myGroups[4]= "Mikael";


       // System.out.println(myGroups);//hashcode
        System.out.println(Arrays.toString(myGroups));

        System.out.println("-----------------------------------------------");

        String[] days  = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<0||number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
