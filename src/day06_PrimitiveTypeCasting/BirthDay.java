package day06_PrimitiveTypeCasting;
/*
                if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
public class BirthDay {
    public static void main(String[] args) {
      String name = "John",
              birthMonth="April";
      int birthDay = 25,
              birthYear= 1996;
      String message= name+ " was born on "+ birthMonth+"/"+birthDay+"/"+birthYear+".";
        System.out.println(message);

        System.out.println("----------------------------");

        //My favorite book is "bookName"

        String bookName = "Sefiller";

        System.out.println("My favorite book is \""+bookName+ "\"");

    }
}
