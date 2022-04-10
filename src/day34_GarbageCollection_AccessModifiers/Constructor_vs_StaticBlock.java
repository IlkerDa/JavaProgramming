package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Statik Block");

    }

    public Constructor_vs_StaticBlock(){ //only depends on object. to run we need object
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

        Constructor_vs_StaticBlock obj1 = new Constructor_vs_StaticBlock();
    }

}
