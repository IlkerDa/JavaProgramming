package day42_Exceptions;

import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-------- Test 1------------");
//throws un avantaji exceptiona en hizli cozum,
// daha az kod/blok yaziyoruz daha temiz duzneli gorunuyo
// eger throwsun oldugu metot baska bir metotta call edilmeyecekse throws yontemi en iyi yontem
// eger bu metot edilirse utility class ise farkli

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------- Test 1 Completed------------");

        System.out.println("-------- Test 2------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------- Test 2 Completed------------");
    }
}
