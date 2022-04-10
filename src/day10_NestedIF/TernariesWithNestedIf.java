package day10_NestedIF;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 145;

        if(s>=0 && s<=100){ // precondition
            if(s>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid");
        }

        System.out.println("-------------------------------");
        String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid";
        System.out.println("result = " + result);


    }
}
