package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota","Camry","black", 2021,25000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW","35i", "green",2022, 50000.5);
        System.out.println(car2);

        Car car3 = new Car();
        car3. setInfo("Mercedes","XE","red",2020, 45000.6);
        System.out.println(car3);

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand+" "+ each.price);
        }

        System.out.println("---------------------------------------------------");

        carsList.removeIf(p->p.brand.equals("BMW")&& p.year>=2005 && p.year<=2008);

    }
}
