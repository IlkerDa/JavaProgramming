package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 3, "small", "white");
        dog.eat();
        dog.drink();
        dog.sleep();
        //dog.scratch(); cat metot
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "brown");
        cat.eat();
        cat.scratch();
        cat.move();
        cat.meow();
        //cat.bark(); // dog metot

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);
        //tiger.bark(); dog metot
    }


}
