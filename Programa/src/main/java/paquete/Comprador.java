public class Comprador{
    private String sonido;
    private int vuelto;
    //Metodos
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{ //Que significa que el comprador haga throws
        Producto p = exp.comprarProducto(m, cualProducto);
        sonido = p.sabor();
        while(true){
            Moneda monedita = exp.getVuelto();
            if(monedita == null){
                break;
            }else{
                vuelto = vuelto + monedita.getValor();
            }
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}
