package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }


    static { // runs first time and only runs one time.
        System.out.println("Static Block1");
    }



    static {
        System.out.println("Static Block2");
    }

}
