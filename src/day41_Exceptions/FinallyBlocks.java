package day41_Exceptions;

/* interview question: final - finally - finalize farki nedir?
                     FINAL:   keyword for applied to var. blok and metots to make them unchangable
                     FINALLY: optional block after last catch blok /
                              always gets executed regardless off the exception is being handled or not
                              to stop the execution of finally block: use System.exit(0) in the last catch block
                     FINALIZE: method that garbage collector calls and
                               this method is clearing the unreferenced objcets from heap memory
                               object classda tanimli
 */

public class FinallyBlocks {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block");

        }catch (RuntimeException e){ // seleniumda herzaman RuntimeException kullaniyoz
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }


    }
}
