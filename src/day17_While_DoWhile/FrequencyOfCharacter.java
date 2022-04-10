package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBC";
        char ch = 'B';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (eachChar==ch){
                frequency++;
            }

        }
        System.out.println(frequency);

    }

}

/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */