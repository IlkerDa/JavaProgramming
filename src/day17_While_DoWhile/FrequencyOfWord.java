package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "JavaJavaJavaJava";
        int frequency = 0;

        for (int i = 0; i < sentence.length()-4 ; i++) {
            String eachString = sentence.substring(i, i+4);

            if( eachString.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
/*
	2. write a program that can return the frequency of
	 a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */