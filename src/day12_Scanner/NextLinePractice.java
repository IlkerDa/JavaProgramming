package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine(); // capture enter

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your school name: ");
        String school = scan.nextLine();


scan.close();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);




    }
}

/*
1. ask user age
2. ask user full name
 */