package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(123243);
        iphone.faceTime("mike@gmail");
        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(1232345);
        samsung.freeze();
        System.out.println("--------------------------------------------------");

        nokia.call(911);
        nokia.text(12435);
        nokia.selfDefense();
        System.out.println("--------------------------------------------------");
        // static var Class ile call edilir
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(Phone.hasBattery);





    }
}
