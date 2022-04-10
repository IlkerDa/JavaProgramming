package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        
        String fullName = input.nextLine();

        System.out.println("Enter your programmming language");
        String programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 25Enter
        input.nextLine(); // capture the enter key

        System.out.println("Enter your school name ");
        String school = input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        
        input.close();
    }
}
