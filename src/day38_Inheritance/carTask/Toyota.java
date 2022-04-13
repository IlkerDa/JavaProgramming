package day38_Inheritance.carTask;

import javax.imageio.stream.ImageInputStream;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    // public > protected > default > private
    // subclassdaki overriding metot parent classdaki metotunkiyle ya ayni
    // ya da daha visible olmali. parent default ise child default protected public olabilir.
    // parent class private olamaz.



    @Override
    public void start(){ // same action (start) different implementation in different subclasses

        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }

}

/*
1. Toyota:
					extra methods:
							reliable()
 */