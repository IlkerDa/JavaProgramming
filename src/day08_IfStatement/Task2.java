package day08_IfStatement;

public class Task2 {
    public static void main(String[] args) {

        byte number = 7;

        boolean s1 = number >=1 && number <=5;

        if (s1){
            System.out.println("Elementary school");
        }

        boolean s2 = number>=6 && number<=8;

        if (s2){
            System.out.println("Middle school");
        }

        boolean s3 = number>=9 && number<=12;
        if (s3){
            System.out.println("High school");
        }

        boolean s4 = number>=13 && number<=16;

        if (s4){
            System.out.println("College");
        }

        boolean s5 = !s1 && !s2 && !s3 && !s4 && number <= 18;
        if (s5){
            System.out.println("Grad School");
        }

    }
}
/*

	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */