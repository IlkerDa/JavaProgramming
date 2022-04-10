package day13_String;



public class StringIntro {
    public static void main(String[] args) {


        String name = "Wooden Spoone"; // HEAP'de depolanir. All the objects "Wooden Spoon"gibi you created stored in HEAP (yigin)
        // local variable str1 str2 gibi bunlar STACK'da depolanir extra memory almaz.
        // Scanner scan = new Scanner(System.in); // scan==> local varible oluyor STACK da depolanir
        // new Scanner(System.in)==> object HEAP da depolanir consume memory

        String str = "Java";
        String str3 = "java";

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1==str2); //false

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false




    }
}
