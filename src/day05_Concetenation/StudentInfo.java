package day05_Concetenation;

public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "Ilker";
        int age = 39;
        char gender = 'M';
        String schoolName = "CYDEO";
        String phoneNumber = "0-712989-2374";
        boolean full_time = true;
        double GPA = 2.65;


        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("schoolName = " + schoolName);
        System.out.println("GPA = " + GPA);
        System.out.println("full_time = " + full_time);
        System.out.println(studentName+age);


    }
}

/*
   2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)

 */