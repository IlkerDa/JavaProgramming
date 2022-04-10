package day20_Array;

import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        String[] items = new String[5];
        double[]prices = new double [5];
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;

        for (int i = 0; i < items.length; i++) {
            System.out.println("enter an item");
            items[i]= scan.next();
            System.out.println("enter its price");
            prices[i]= scan.nextDouble();
            sum+=prices[i];
        }

        System.out.println("total price: "+ sum);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+": "+prices[i]);

        }
scan.close();

    }
}

/*
Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
/*
 package day20_Arrays;

import java.util.Scanner;

public class ClassNotesTask_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item name:");
            items[i] = scan.next();
            System.out.println("Enter price:");
            prices[i] = scan.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i]+" -- "+prices[i]);
        }
        int totalPrice = 0;
        for (double each : prices) {
            totalPrice += each;
        }
        System.out.println("totalPrice = " + totalPrice);

    }
}
/*
 Items
            1. Create an array named items with the length of 5
            2. Create an array named prices with the length of 5
            3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
            4. calculate the total price of the arrays
            5. display each item name and price in separate lines
                        ItemName -- Price
 */
