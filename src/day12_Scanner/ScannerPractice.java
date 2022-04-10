package day12_Scanner;
// import java.util.* // wild import. not recommended
import java.util.Scanner; // regular import

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number btwn 1 to 7: ");

        byte num = scan.nextByte();

        String result;

        if(num>=1 && num<=7){
           result= (num==1)? "Monday": (num==2)? "Tuesday": (num==3)? "Wednesday": (num==4)? "Thurday": (num
            ==5)? "Friday": (num==6)? "Saturday": "Sunday";
            } else {
            result= "Invalid number";
        }

        System.out.println(result);

        scan.nextInt();

        scan.close();


    }
}
