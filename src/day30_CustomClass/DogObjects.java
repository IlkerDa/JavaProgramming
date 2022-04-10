package day30_CustomClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age=5;
        dog1. gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2  = new Dog();
        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","Kangal",5,'M',"big","white");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();



        Dog dog4 = new Dog();
        dog4.setInfo("Bullet","Labrodor",2,'M',"big","black");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully","pitbul",6,'M',"large","white");


        Dog [] dogs = {dog1, dog2,dog3,dog4,dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1, dog2,dog3,dog4,dog5));

        /*for (Dog each : dogsList) {
            if(each.gender=='F'){
                femaleDogs.add(each);
            }else {
                maleDogs.add(each);
            }
        }
        /*


         */


         dogsList.removeIf(p-> p.gender=='M');

        System.out.println(dogsList);


        System.out.println(femaleDogs);
        System.out.println(maleDogs);




    }
}
