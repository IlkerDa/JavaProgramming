package day33_Statics;

public class Iphone {
    public static String brand = "Apple";  // instance mi static mi variable onu inceliyoz
    public String model;
    public double price;
    public static String oS = "IOS";
    public String color;
    public static String madeIn = " China";
    public static boolean battery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(oS);
    }

  //  public static void printModelAndPrice(){ //statik metot instance var. icermez
   //     System.out.println(model+ " : "+ price);
  //  }

    public void method1 (){
        System.out.println(model+ " : "+ price);
        System.out.println(oS);

    }


}
