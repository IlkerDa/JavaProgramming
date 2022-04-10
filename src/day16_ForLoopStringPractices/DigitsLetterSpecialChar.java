package day16_ForLoopStringPractices;

public class DigitsLetterSpecialChar {
    public static void main(String[] args) {
        String str = "Cyde012345School!@  #$%Wooden Spoon";

        String digits = ""; //12345
        String letters = ""; //CydeoScoolWoodenSpoon
        String specialChars = ""; //!@#$

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            char ch = str.charAt(i); // ch : each char. that we have in str
            if (ch>='0' && ch<='9') {
                digits += ch;
            }else if(ch>='A' && ch<='Z'){
                    letters += ch;
                }else if (ch>='a' && ch<='z'){
                letters +=ch;
            }else {
                if( ch !=' '){
                specialChars += ch;
            }
        }
    }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
}
}
