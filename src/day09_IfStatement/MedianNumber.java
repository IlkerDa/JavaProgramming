package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 89, b=30, c=20;

        boolean aMedian = (a>b && c>a) || (a<b && a>c);
        boolean bMedian = (b<a && c<b) || (c>b && b>a);
        boolean cMedian = !aMedian &&!bMedian;
        if (aMedian){
            System.out.println(a + "is the median number");
        }
        if(bMedian){
            System.out.println(b + "is the median number");
        }

        if(cMedian){
            System.out.println(c+ "is the median number");
        }

    }
}
/*
	2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */