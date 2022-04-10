package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
//import static day34_GarbageCollection_AccessModifiers.Circle.pi;
// static import yapinca metot ya da var. call edince class ismi nokta demene gerek kalmiyor
public class StaticImport {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(pi);
        System.out.println(numbers);
        System.out.println(Circle.name);
    }
}
