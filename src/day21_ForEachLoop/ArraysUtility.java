package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(nums);//hashcode
        System.out.println(Arrays.toString(nums));//"{1,2,3,4,5}"

        System.out.println(nums[0]);// element
        System.out.println("-------------------------------");
        int[] scores = {100,56,78,34,87,88,12};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);  // 12 34 56
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score: "+ scores[0]);
        System.out.println("Max Score: "+ scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] word = {"Anna", "ANNA"}; // Buyuk harf once gelir aski tableda
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        System.out.println("-------------------------------");

        int[ ]arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);

        System.out.println("-------------------------------");

        char [] ch1 = {'a', 'c','b'};
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram= Arrays.equals(ch1,ch2) ;
        System.out.println(anagram);



    }
}
