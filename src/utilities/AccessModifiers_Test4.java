package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        //    System.out.println(AccessModifiers_Test4.name1); // default is not visible outside package
        System.out.println(AccessModifiers_Test4.name2); // protected is visibel outside package IN SUBCLASS ONLY

         // AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2(); //


    }
}
