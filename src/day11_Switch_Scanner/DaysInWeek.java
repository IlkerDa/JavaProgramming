package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 1;

        switch (number) {        // 1 2 3 4 5 6 7 all possible values
            case 1:
                System.out.println("Monday");
                break; // exits the switch after the case block
            default: // only gets executed if none of the case blocks are matching
                System.out.println("Invalid number");
                case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;



        }


    }
}
