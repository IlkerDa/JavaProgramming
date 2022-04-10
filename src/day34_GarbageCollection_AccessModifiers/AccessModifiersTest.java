package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData);


        AccessModifiers.method1(); // public
        AccessModifiers.method2(); //default
        // private not visible

    }

}
