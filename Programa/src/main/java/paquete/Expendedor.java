package paquete;
/**
 * La clase Expendedor proporciona metodos para realizar compras a una maquina expendedora, y obtener el vuelto si el pago excedio el precio
 */
public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snicker;
    private Deposito<Moneda> vuelto;

    /**
     * Este metodo corresponde al metodo constructor del expendedor y permite la instancia del mismo con un numero de igual de productos en cada deposito
     *
     * @param numProductos Almacena el un entero que corresponde al numero del productos inicial con el que se quiere instanciar el expendedor
     */
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

    /**
     * Este metodo permite la compra de productos al expendedor ingresando el pago y eligiendo que tipo de producto quiere comprar
     *
     * @param m Corresponde a la moneda con la que se quiere pagar
     * @param cual Corresponde a un entero con el que se elige el tipo de producto que se quiere comprar
     * @return En el caso de que el pago y la eleccion del tipo de producto sea correcta retorna el producto seleccionado
     * @throws PagoIncorrectoException Excepcion en caso de que se quiera comprar sin moneda (se intenta comprar con moneda null"
     * @throws PagoInsuficienteException Excepcion en caso de que el pago sea menor al precion del producto
     * @throws NoHayProductoException Excepcion en caso de que el deposito esté vacío o el se haya ingresado un tipo de producto erroneo
     */
    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Producto aux = null;
        int precio = 0;
        if (m == null) { //Condicional por si pagan con moneda nula
            throw new PagoIncorrectoException("PagoIcorrectoException");
        }
        if (cual == TipoProducto.COCACOLA.tipo){
            if(m.getValor() < TipoProducto.COCACOLA.precio){
                vuelto.addObjeto(m);
                System.out.println("Vuelto = " + m.getValor());
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = coca.getObjeto();
                precio = TipoProducto.COCACOLA.precio;
            }
        }else if(cual == TipoProducto.SPRITE.tipo){
            if(m.getValor() < TipoProducto.COCACOLA.precio){
                vuelto.addObjeto(m);
                System.out.println("Vuelto = " + m.getValor());
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = sprite.getObjeto();
                precio = TipoProducto.SPRITE.precio;
            }
        }else if(cual == TipoProducto.FANTA.tipo){
            if(m.getValor() < TipoProducto.FANTA.precio){
                vuelto.addObjeto(m);
                System.out.println("Vuelto = " + m.getValor());
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = fanta.getObjeto();
                precio = TipoProducto.FANTA.precio;
            }
        }else if(cual == TipoProducto.SUPER8.tipo){
            if(m.getValor() < TipoProducto.SUPER8.precio){
                vuelto.addObjeto(m);
                System.out.println("Vuelto = " + m.getValor());
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = super8.getObjeto();
                precio = TipoProducto.SUPER8.precio;
            }
        }else if(cual == TipoProducto.SNICKER.tipo){
            if(m.getValor() < TipoProducto.SNICKER.precio){
                vuelto.addObjeto(m);
                System.out.println("Vuelto = " + m.getValor());
                throw new PagoInsuficienteException("PagoInsuficienteException");
            }else{
                aux = snicker.getObjeto();
                precio = TipoProducto.SNICKER.precio;
            }
        }
        if(aux == null){
            vuelto.addObjeto(m);
            System.out.println("Vuelto = " + m.getValor());
            throw new NoHayProductoException("NoHayProductoException");
        }
        int n = (m.getValor() - precio)/100;
        for (int i = 0; i < n; i++){
            vuelto.addObjeto(new Moneda100());
        }
        return aux;
    }

    /**
     * Este metodo permite la obtencion del vuelto en caso de que la compra se haya realizado correctamente
     * @return Retorna una moneda del deposito (en particular retorna el primer elemento del deposito de monedas)
     */
    public Moneda getVuelto(){
        return vuelto.getObjeto();
    }
}
