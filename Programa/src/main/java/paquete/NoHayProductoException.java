public class NoHayProductoException extends Exception{
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
}
