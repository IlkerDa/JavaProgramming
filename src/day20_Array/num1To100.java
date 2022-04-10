package day20_Array;

import java.util.Arrays;

public class num1To100 {
    public static void main(String[] args) {
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=numbers.length-i;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
