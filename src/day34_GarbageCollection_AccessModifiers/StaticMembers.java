package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // outer class

    static class class1{ // static sadece inner class da olur

    }

    public static  int num  = 100;

    public static void method(){

    }

    static {

    }

}

     class A{
        static class B{  // sadece nested class olursa class static olur. tek basina bir class static olamaz
            public static void method1(){

            }


        }
    }


    class C{
        public static void main(String[] args) {
            A.B.method1();
        }

    }
