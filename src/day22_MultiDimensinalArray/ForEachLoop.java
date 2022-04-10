package day22_MultiDimensinalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        // index of the elements:  0 1 2     0 1 2 3    0 1 2 3 4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2

        for (int[] each1Darray : arr2D) {

            //System.out.println(Arrays.toString(each1Darray));

            for (int eachElement : each1Darray) {
                System.out.println(eachElement);

            }

        }



    }
}
