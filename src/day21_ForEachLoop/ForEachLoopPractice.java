package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {

            System.out.println(each.charAt(0)+ ""+ each.charAt(each.length()-1));

        }
        System.out.println("-------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }


    }
}
