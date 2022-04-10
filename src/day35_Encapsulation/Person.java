package day35_Encapsulation;

public class Person {

    public String name; // instance variable
    public int age;
    public char gender;
    public String language;

    public static String planet;  //static var.
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    //ExcelSheet

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    } // instance var icin contstructor

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;
    } // static var icin statik blok kullaniyoruz

    public static void printPlanetName() {  //statik metotu class nameden cagirabiliriz, instance metot icin objectin var olmasi gerek
        System.out.println("Planet name is " + planet);
    }

    public void eat(String food){
        System.out.println(name+ " is drinking "+ food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +

                '}';
    }
}

/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */

