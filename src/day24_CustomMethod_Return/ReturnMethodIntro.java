package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str = "Mike";

        String output= reverse(str);

        System.out.println(output);


    }


    public static String reverse(String word){
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {

            result += word.charAt(i);

        }
        return result;
    }

}


