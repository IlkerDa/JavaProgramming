package day05_Concetenation;

public class CarInfo {
    public static void main(String[] args) {
        //2018 Toyota Camry, 50000 miles, Red, $19000.

        int year= 2018;
        String make = "Toyota";
        String model = "Camry";
        int miles= 5000;
        String colour = "Red";
        int price = 19000;

        String carInfo = year+ " " + make + " "+ model + ",\n"+ miles+ " miles"+ ", "+ colour+ ",\n$"+price+".";
        System.out.println(carInfo);
    }
}
