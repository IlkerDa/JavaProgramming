package day10_NestedIF;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 1;

        if (ch>=0 && ch<=9){
            System.out.println("Digit");
        }else if((ch>='a' && ch<= 'z') || (ch>='A' && ch<= 'Z')){
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special Character");
        }

    }
}
/*
4. Create a class called Character Identity, and write a program that can identify
 if the given character is a digit or Alphabetic Character(A~Z or a~Z) or
 a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */