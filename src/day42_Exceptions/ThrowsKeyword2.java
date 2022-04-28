package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test started");

        System.out.println(8/0); //unchecked exception, throws kullansak bile hata veriyor sonraki kodu run etmiyor
                                // bu yuzden UNCECKED EXCEPTION varsa throws kullanMA!

        System.out.println("Test completed");
    }
}
