package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char score = 'i';

        switch (score){

            case 'A':
                System.out.println("'A': excellent");
                break;
            case 'B':
                System.out.println("'B': great job");
                break;
            case 'C':
                System.out.println("'C': good");
                break;
            case 'D':
                System.out.println("'D': passed");
                break;
            case 'F':
                System.out.println("'F': failed");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
