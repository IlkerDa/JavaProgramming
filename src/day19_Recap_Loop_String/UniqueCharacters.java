package day19_Recap_Loop_String;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";//bdf


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; // freq of char

            for (int i = 0; i < str.length(); i++) {//compares the char that outer loop picked
                char each = str. charAt(i);
                if(ch==each){
                    count++;
                }
            }

            if(count!=1){
                continue;

            //if(count==1){ // the char is uniq



            }
            result +=ch;
        }

        System.out.println(result);



    }
}

/*
	2. Write a program that can find the unique characters
	 from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */