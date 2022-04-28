package day43_Abstraction.car;

public abstract class Car { // abstract class is meant to be parent class o yuzden FINAL-PRIVATE OLAMAZ
    private final String brand, model; // variable final yapinca objeyi olusturduktan sonra bu finalli ozellikleri setter ile degistiremiyoz
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year<0) {
            throw new RuntimeException("Invalid Year:  "+ year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0) {
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start(); // abstract metot sadece abstract class veya interface icinde olusturulur.
                                    // abstract metot FINAL-STATIC-PRIVATE olamaz cunku override ediliyor(override kurali)

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

