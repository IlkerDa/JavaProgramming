package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cdeo";
        //  index:     0123

        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);
/*
        char thenthChar = word.charAt(9);
        System.out.println(thenthChar);

 */
        System.out.println("========================================================");

        String s1 = "Batch 25 is the best batch.";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length() - 1); // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("========================================================");
        
        String str = "wooden spoon";
        str = str.toUpperCase();  //"WOODEN SPOON"
        System.out.println("str = " + str);
        
        // Today is a great day to learn Java
        String sentence = "Today is a great day to learn Java";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);
        

    }
}
