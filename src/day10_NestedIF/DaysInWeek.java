package day10_NestedIF;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 4; // 1-7
        String day;

/*
        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if(n==4){
            day= "Thursday";
        }else if (n==5){
            day = "Friday";
        }else if (n==6){
            day = "Saturday";
        }else if(n==7){
            day = "Sunday";
        } else{
            day="Invalid";
        }

        System.out.println("day = " + day);


 */

        String nameOfDay= (n==1)? "Monday" : (n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)? "Friday" :(n==6)? "Saturday" : "Sunday";
        System.out.println("nameOfDay = " + nameOfDay);







    }
}
