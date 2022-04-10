package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1  = new Dog("Alex", "Husky", 'M',1,"Small","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Minnos","Van", 'F', 2, "medium","White");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");
        System.out.println(parrot1);
        parrot1.sing();
        // parrot1.bark();
    }
}
