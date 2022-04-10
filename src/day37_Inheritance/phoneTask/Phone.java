package day37_Inheritance.phoneTask;

public class Phone { // parent class only contains common features of all child classes
    public String brand, model, size; // static vs instance eger verinin multiple deger almasini istiyorsam instance degismemesini istiyorsam static
    public double price;
    public String color;

    public static boolean hasBattery = true; // several step aliyorsa var. hemen burda true false demem static acarim asagida
    // constructor subclassa inherit ETMEZ
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    // metotlar subclassa inherit oluyor
    public void call(long phoneNumber){
        System.out.println(brand+ " "+ model+ " is calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+ " "+ model+ " is texting "+ phoneNumber);
    }

/*
    static {    // static blok mandatory deil eger static var. needs several steps we use static block
        hasBattery = true;
    }
 */

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}



/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
