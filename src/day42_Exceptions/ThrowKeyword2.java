package day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {


        throw new NoSuchElementException("No such Element");

        // throw new InterruptedException(); checked exc. compile unhappy:)
        //throw new Rectangle(5,7); throw new, sadece exception classlar ile kullanilir

        // System.out.println("hello world"); throwdan sonra birsey run edilmez unchecked exc.
    }
}
