public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
}