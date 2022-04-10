package day05_Concetenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Mike";
        String lastName = "Rocco";
        String fullName = firstName+" "+lastName;
        int age = 28;
        String companyName = "Sony AB.";
        String jobTitle = "SDET";
        double salary = 100929.84;

        System.out.println("Full name is the person is "+fullName+".");
        System.out.println(fullName+ " is "+ age+ " years old.");
        System.out.println(fullName+" is "+jobTitle+ ", works at "+ companyName+ "; and "+ fullName+"'s salary is $"+ salary);
    }
}
