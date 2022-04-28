package day42_Exceptions;

import javax.swing.plaf.TableHeaderUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {
    /*
    1. exception unchecked ise tek secenek var sadece try catch kullan
    2. exception checked ise 2 secenek var ya try catch ya da throws. Mantikli sekilde secim yap.
     misal check execptionli metotu baska metotta call edeceksen try catch kullan ki kalici cozum olsun
     */

    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
        method3();

        String str = null;

        try {
            System.out.println(str.charAt(0));  // UNCHECKED EXCEPTION old icin ASLA throws kullanilmaz
        } catch (RuntimeException e){           // universal solution try catch dir. seleniumda bu cok kullanilacak
            e.printStackTrace();
        }


    }

    public static void method(){
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws InterruptedException {
       // new FileInputStream(" ");
        Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException {
        method1();
    }

    public static void method3() throws InterruptedException { // AMA exceptionli metotun call edilmeyeceinden %100 eminsem best solution is to use throws!

        method2();
        Thread.sleep(1000);
    }

   // public static void method4() throws Exception { throws Exception (parent class) kullanmak hata vermez AMA ONERILMEZ. not best solution
    //    method3();
   // }


}
