package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";


        boolean isEligibleToVote = age >= 18  && citizen== "USA";
        System.out.println(name+ " is eligible to vote: " + isEligibleToVote);
        

        System.out.println("---------------------------------- ");

        String name2 = "Josh";

        int creditScore = 720,
                age2 = 23,
                income = 40000;


        boolean isEligibleToLoan = creditScore >=700 && age2 >= 21 && income>60000;
        System.out.println(name2+ " is eligible to loan: " + isEligibleToLoan);

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligble3 = age3>= 18 && (gender == 'M'  || gender == 'F');
        System.out.println(name3 + " is eligible: " + isEligble3);

        String name4 = "James";
        String countryOfBirth= "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth=="USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible: " + isEligible4);

        String student = "Anna";
        double gpa= 3.5;
        int familyIncome= 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible: " + isEligible5);
        System.out.println("---------------------------------- ");

        boolean result1 = true;
        boolean result2 =! result1;

        System.out.println("result2 = " + result2);
        
        int score = 85;
        boolean passed = score >=60;
        boolean failed = ! passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);






    }
}
