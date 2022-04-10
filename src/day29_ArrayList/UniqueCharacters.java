package day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefggggggiiiiiijkkkkl";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {
                unique += each;
            }

        }

        System.out.println("unique = " + unique);

    }
}
