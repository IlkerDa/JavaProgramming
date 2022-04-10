package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("Enter building number");
        String buildnumber = input.next();

        input.nextLine();

        System.out.println("Enter street name");
        String street = input.nextLine();

        System.out.println("Enter city name");
        String city = input.nextLine();

        System.out.println("Enter state");
        String state = input.next();

        System.out.println("Enter zip code");
        String zipCode = input.next();

        input.close();

        System.out.println("name = " + name);
        System.out.println("buildnumber = " + buildnumber);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        System.out.println(name+"\n"+ buildnumber+ " "+ street+ "\n"+ city+ ", "+ state+ " "+zipCode);








    }
}
