package paquete;

public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snicker;
    private Deposito<Moneda> vuelto;
    //Metodos
    //Constructor
    public Expendedor(int numProductos) {
        coca = new Deposito<>(numProductos);
        sprite = new Deposito<>(numProductos);
        fanta = new Deposito<>(numProductos);
        super8 = new Deposito<>(numProductos);
        snicker = new Deposito<>(numProductos);
        vuelto = new Deposito<>(0);
        for (int i = 0; i < numProductos; i++) {
            coca.addObjeto(new CocaCola(i + 100));
            sprite.addObjeto(new Sprite(i + 200));
            fanta.addObjeto(new Fanta(i + 300));
            super8.addObjeto(new Super8(i + 400));
            snicker.addObjeto(new Snickers(i + 500));
        }
    }
    //Comprar
    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Producto aux = null;
        int precio = 0;
        if (m == null) { //Condicional por si pagan con moneda nula
            throw new PagoIncorrectoException("PagoIcorrectoException");
        }
        if (cual == TipoProducto.COCACOLA.tipo){
            if(m.getValor() < TipoProducto.COCACOLA.precio){
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = coca.getObjeto();
                precio = TipoProducto.COCACOLA.precio;
            }
        }else if(cual == TipoProducto.SPRITE.tipo){
            if(m.getValor() < TipoProducto.COCACOLA.precio){
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = sprite.getObjeto();
                precio = TipoProducto.SPRITE.precio;
            }
        }else if(cual == TipoProducto.FANTA.tipo){
            if(m.getValor() < TipoProducto.FANTA.precio){
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = fanta.getObjeto();
                precio = TipoProducto.FANTA.precio;
            }
        }else if(cual == TipoProducto.SUPER8.tipo){
            if(m.getValor() < TipoProducto.SUPER8.precio){
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = super8.getObjeto();
                precio = TipoProducto.SUPER8.precio;
            }
        }else if(cual == TipoProducto.SNICKER.tipo){
            if(m.getValor() < TipoProducto.SNICKER.precio){
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = snicker.getObjeto();
                precio = TipoProducto.SNICKER.precio;
            }
        }
        if(aux == null){ //Condicional por si el deposito esta vacio o se ingreso un numero de producto incorrecto
            vuelto.addObjeto(m);
            throw new NoHayProductoException("NoHayProductoException");
        }
        int n = (m.getValor() - precio)/100;
        for (int i = 0; i < n; i++){
            vuelto.addObjeto(new Moneda100());
        }
        return aux;
    }
    //Vuelto
    public Moneda getVuelto(){
        return vuelto.getObjeto();
    }
}