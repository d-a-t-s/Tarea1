public enum TipoProducto {
    COCACOLA(1, 400), SPRITE(2, 500), FANTA(3, 600), SUPER8(4, 700), SNICKER(5, 800);
    final int tipo;
    final int precio;

    TipoProducto(int tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
}
