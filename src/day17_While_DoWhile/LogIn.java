package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name:");
        String u = scan.next();

        System.out.println("enter your user password:");
        String p = scan.next();

        if (u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attempt =3;

            while (!(u.equals("Cydeo")&& p.equals("Cydeo123"))&& attempt>0){

                if (attempt==1){
                    System.out.println("THIS IS YOUR CHANCE");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("enter your user name:");
                u = scan.next();

                System.out.println("enter your user password:");
                p = scan.next();
                attempt--;

            }

            if(u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }


        scan.close();

    }
}
/*
. You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is locked."

 */