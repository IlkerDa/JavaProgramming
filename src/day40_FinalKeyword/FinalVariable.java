package day40_FinalKeyword;

public class FinalVariable {
   final String birthday;
   final static String name;

   static {
       name = "EU-8";
   }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }


    public static void main(String[] args) {

        final double pi = 3.14;
       // pi= 4.12; // final var cannot be reassigned

        final String name;
        name = "Java";
        //name = "WS";
        System.out.println(name);
        System.out.println("----------------------------------------");

        FinalVariable obj = new FinalVariable("May");
     //   obj.birthday = "June"; // final var cannot be reassigned
        System.out.println(obj.birthday);
        System.out.println("----------------------------------------");

       // FinalVariable.name = "Pyhthon";
        System.out.println(FinalVariable.name);








    }
}
