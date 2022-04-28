package day42_Exceptions;

class FadyException extends RuntimeException{ // custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){

        super(message);


    }

}

class NoBreakException extends Exception{ // custom checked exception
                                        // exception classda checked exceptionlar da var
                                        // dolayisiyla throw new yaparsak, unhandled exception yani checked exc hatasi verir

}

public class CustomExceptions {
    public static void main(String[] args) {

        //throw new FadyException();

        try {
            throw new NoBreakException(); // exception classa extends ettigim icin hata verdi
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }
}
