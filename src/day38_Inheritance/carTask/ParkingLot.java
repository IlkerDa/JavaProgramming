package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        // one class using another class = HAS A  relation
        Toyota toyota = new Toyota("Camry",2020,20000,"red",12324);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw =new BMW("X5", 2020, 67350, "black", 12000);

        toyota.start();
        bmw.start();
        tesla.start();

    }
}
