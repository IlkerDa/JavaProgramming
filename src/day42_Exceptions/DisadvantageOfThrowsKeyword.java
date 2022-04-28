package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {
        //sleep(2.5); // throwsun dezavantaji: used for ONLY checked exceptions. throwslu metotu call edersek sorumluluk onu call eden de, yine excpetion veriyor
        //throws =temprorary and fastest cheapest way solution , running away from solution.
        // AMA exceptionli metotun call edilmeyeceinden %100 eminsem best solution is to use throws!
        // try cathc = permanent best solution. exceptionli metot call ediliyorsa try catch permanent solution
        System.out.println("Hello World");
        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkout.sleep(2.5);// try catchli metotu call edersek bu sorun olmuyor
    }



        public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long) (seconds * 1000));

        }

}
