public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
}