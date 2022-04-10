package day08_IfStatement;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number = 12;
        boolean January = number==1;
        if (January){
            System.out.println("January");
        }
        boolean february = number==2;
        if (february){
            System.out.println("February");
        }

        boolean march = number==3;

        if(march){
            System.out.println("March");
        }
        boolean april = number==4;
        boolean may = number==5;
        boolean june = number ==6;
        boolean july = number == 7;
        boolean august = number ==8;
        boolean september = number ==9;
        boolean october = number==10;
        boolean november = number==11;
        boolean deecmber = number==12;

        if(april){
            System.out.println("April");
        }
        if (may){
            System.out.println("May");
        }

        if(june){
            System.out.println("June");
        }
        if(august){
            System.out.println(" August");
        }
        if (september){
            System.out.println("September");
        }
        if (october){
            System.out.println("October");
        }
        if(november){
            System.out.println("November");
        }

        if(deecmber){
            System.out.println("December");
        }
    }
}

/*
1. write a program that can display the name of the month

			number = 1 ~ 12

 */