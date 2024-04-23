package paquete;
/*
* Clase abstrata Producto representa un Producto genérico.
* */
public abstract class Producto {
    /*
    * Serie del producto
    * */
    private int serieProducto;

    /*
    * Constructor del producto
    * @param serie Define que serie/codigo tendra el producto
    * */
    public Producto (int serie) {
        this.serieProducto = serie;
    }

    /*
    * Método que nos dirá el producto que hemos comprado
    * */
    public abstract String sabor();
}
