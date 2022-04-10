package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {


        // age: 38 years old
        byte age = 38;

        //weight: 160 pounds
        // byte weight = 160; 160 is out of range of byte var. type

        short weight = 160; // 160 is within range of "short"

        // salary=100000$
       // short salary = 100000; 10000 is out of range of 'short'
        int salary = 100_000; //int is the preferred data type for integer numbers
        long assets = 3_000_000_000_000l; // the # is out of range of integer type
        // compiler 'int'i default kabul eder, long sayida sonuna 'l'yazmak gerek

        // tax rate: 0.26
        float tax = 0.26f; // double default olan decimalde o yuzden sayi sonuna 'f'gelir.
        double ef = 1324324323;

        char ch1 = '#';
        char ch2 = 35;
        char ch3 = 1;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        char ch4 = 65535;
        System.out.println("ch4 = " + ch4);

        char gender = 'M';
        char grade = 'F';
        char yesNo = 'Y';
        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 < 300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);
        
        
        String name = "Wooden Spoon";
        String city = "Lund";
        String state = "Skane";
        String country = "Sweden";

        System.out.println("name = " + name);













    }
}
