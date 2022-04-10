package day03_EscapeSequences;
/*

Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython\nC#");
        System.out.println("-------------");

        System.out.println("Hello Cydeo\n\nHow are you all today? \nIt's nica to see you all!");
        System.out.println("*\n **\n***\n****\n *****\n******");
        System.out.println("\tJava is cool programming language");
        System.out.println("    Java is cool programming language");
        System.out.println("-------------------");

        System.out.println("/ \\");

        System.out.println("\"");
        System.out.println("my favorite movie is \"3 idiots\"");

    }
}
