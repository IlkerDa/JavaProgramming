package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        displayInitials("mike", "tysOn");
        System.out.println("--------------------------------");
        domain("miketycon@yahoo.com");
        System.out.println("--------------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };
        for (String email : emails) {
            domain(email);

        }
        System.out.println("--------------------------------");
        nameOfMonth(98);
        System.out.println("--------------------------------");
daysInMonth(2,2022);




    }


    //	1. Create a method that can display the initials of the person
    public static void displayInitials(String firstName, String lastName){
        String initials = ""+firstName.toUpperCase().charAt(0)+ ". "+ lastName.toUpperCase().charAt(0)+".";
        System.out.println(initials);
    }

//	2. Create a method that can display the domain of the email .  domain()
    public static void domain(String email){
        email=email.substring(email.indexOf('@')+1, email.indexOf('.'));
        System.out.println("domain is " + email);

    }

    //	3. Create a method that can display the name of the month based on the given number to the method
public static void nameOfMonth (int num){
        String name = "";
        if(num>=1 && num<=12){
            name= (num==1)? "January": (num==2)? "February": (num==3)? "March": (num==4)? "April": (num==5)? "May": (num==6)?
                    "June": (num==7)? "July": (num==8)? "August": (num==9)? "September": (num==10)?"Oct"
                    :(num==11)?"Nov" : "December";
        }else{
            name= "Invalid number";
        }
    System.out.println("Name of month is "+name);

}

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int num){




    }

    //5. Create a method that can print how many days a month has

    public static void daysInMonth(int number, int year){
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

/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */