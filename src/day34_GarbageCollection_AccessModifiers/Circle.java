package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;



    public Circle(double radius){  // constructorda statik var. yazma
        this.radius = radius;
      //  pi= 3.14; not efficient because every time it runs
    }

    static {  // static in icinde instance var kullanamazsin ve stati bloklar 1 kez run edilir
        pi = 3.14;
        name= "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

/*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }

 */





}
