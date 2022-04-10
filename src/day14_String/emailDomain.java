package day14_String;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.nextLine();
        scan.close();
        //String email = "Cydeo.School@gmail.com";
        email = email.substring(email.indexOf("@")+1  ,email.lastIndexOf("."));
        System.out.println("email domain = " + email);


        
    }
}

/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

 */