package day10_NestedIF;

public class GradeReport2_Ternaries {
    public static void main(String[] args) {

        int s =78;

        String result = " ";
        if (s>=0 && s<=100){
            if (s>=90){
                result= "Excellent";
            }else if(s>=80){
                result = "Great";
            }else if(s>=70){
                result="Good";
            }else if (s>=60){
                result= "Passed";
            }else{
                result="Failed";
            }
        }else{
            result= "s is not valid";
        }

        System.out.println("result = " + result);

        System.out.println("------------------------------------");

        //solution2 by using ternaries ONLY

        String gradeResult= (s>=0 && s<=100)? (s>=90)? "Excellent" : (s>=80)? "Great" : (s>=70)?  "Good"
        :(s>=60)? "Passed" : "Failed" :"score is not valid";

        System.out.println("gradeResult = " + gradeResult);

        System.out.println("------------------------------------");

        //solution3
        String result2 = " ";

        if (s>=0 && s<=100){

            result2= (s>=90)? "Excellent" : (s>=80)? "Great"
                    : (s>=70)?  "Good"
                    :(s>=60)? "Passed" : "Failed";

        }else{
            result2 = "score is not valid";
        }

        System.out.println("result2 = " + result2);
    }
 }
