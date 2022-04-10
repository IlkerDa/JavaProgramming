package day11_Switch_Scanner;

import java.util.*;

public class ScannerPractice4 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSeconds = object.nextInt();

        int hours, minutes, seconds;

        seconds=inputSeconds;

        hours = seconds / 3600;// -> hours // 60 * 60
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + "  hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
