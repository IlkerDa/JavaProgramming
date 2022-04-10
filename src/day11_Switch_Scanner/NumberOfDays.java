package day11_Switch_Scanner;

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */
public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2001;
        String month = "";


        if (number >= 1 && number <= 12) {

            switch (number) {
                case 2:
                    if(year%4 ==0){ //month = (year%4 ==0)? "29 days": "28 days"
                        month="29 days";
                    }else{
                        month = "28 days";
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    month = "30 days";break;
                default:
                    month = "31 days"; break;

            }


        } else{
            month = "Invalid";
        }

        System.out.println(month);
    }
}
