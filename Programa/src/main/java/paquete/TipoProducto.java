package paquete;

/**
 * Esta enumeracion ofrece constantes para poder seleccionar el tipo de producto ademas de asignar a cada tipo de producto un precio diferente
 */
public enum TipoProducto {
    COCACOLA(1, 400), SPRITE(2, 500), FANTA(3, 600), SUPER8(4, 700), SNICKER(5, 800);
    final int tipo;
    final int precio;

    /**
     * Metodo constructor de TipoProducto que inicializa a "tipo" y "precio"
     * @param tipo corresponde a un numero con el cual se selecciona el tipo de producto que se quiere comprar
     * @param precio corresponde al precio de cada producto
     */
    TipoProducto(int tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
}
