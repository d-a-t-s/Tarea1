package paquete;
import javax.management.modelmbean.ModelMBean;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = null;
        Moneda m = null;
        Comprador c;
        //Caso en el que se paga con una moneda, se elige un producto correcto y sobra vuelto
        try{
            exp = new Expendedor(3);
            m = new Moneda1000();
            c = new Comprador(m, 5, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto() + "\n");
        }catch(PagoIncorrectoException PagoIncorrectoException){
            System.out.println("Para comprar debe introducir una moneda primero\n");
        }catch(PagoInsuficienteException PagoInsuficienteException){
            System.out.println("El pago que a ingresado es menor al precio del producto\n");
        }catch(NoHayProductoException NoHayProductoException){
            System.out.println("El deposito está vacio o se introdujo un numero de producto erroneo\n");
        }
        //Caso en el que se quiere comprar con una moneda inferior al precio del producto
        try{
            exp = new Expendedor(3);
            m = new Moneda100();
            c = new Comprador(m, 1, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto());
        }catch(PagoIncorrectoException PagoIncorrectoException){
            System.out.println("Para comprar debe introducir una moneda primero\n");
        }catch(PagoInsuficienteException PagoInsuficienteException){
            System.out.println("El pago que a ingresado es menor al precio del producto\n");
        }catch(NoHayProductoException NoHayProductoException){
            System.out.println("El deposito está vacio o se introdujo un numero de producto erroneo\n");
        }
        //Caso en el que se ingresa un numero de producto incorrecto
        try{
            exp = new Expendedor(3);
            m = new Moneda500();
            c = new Comprador(m, 10, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto() + "\n");
        }catch(PagoIncorrectoException PagoIncorrectoException){
            System.out.println("Para comprar debe introducir una moneda primero\n");
        }catch(PagoInsuficienteException PagoInsuficienteException){
            System.out.println("El pago que a ingresado es menor al precio del producto\n");
        }catch(NoHayProductoException NoHayProductoException){
            System.out.println("El deposito está vacio o se introdujo un numero de producto erroneo\n");
        }
        //Caso en el que se intenta comprar sin moneda (moneda nula
        try{
            exp = new Expendedor(3);
            m = null;
            c = new Comprador(m, 4, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto() + "\n");
        }catch(PagoIncorrectoException PagoIncorrectoException){
            System.out.println("Para comprar debe introducir una moneda primero\n");
        }catch(PagoInsuficienteException PagoInsuficienteException){
            System.out.println("El pago que a ingresado es menor al precio del producto\n");
        }catch(NoHayProductoException NoHayProductoException){
            System.out.println("El deposito está vacio o se introdujo un numero de producto erroneo\n");
        }
        //Caso en el que el deposito queda vacio
        try{
            m = new Moneda1500();
            exp = new Expendedor(1);
            c = new Comprador(m, 2, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto() + "\n");
            Moneda m1 = new Moneda500();
            c = new Comprador(m1, 2, exp);
            System.out.println("Que consumiste: " + c.queConsumiste());
            System.out.println("Cuanto vuelto: " + c.cuantoVuelto() + "\n");
        }catch(PagoIncorrectoException PagoIncorrectoException){
            System.out.println("Para comprar debe introducir una moneda primero\n");
        }catch(PagoInsuficienteException PagoInsuficienteException){
            System.out.println("El pago que a ingresado es menor al precio del producto\n");
        }catch(NoHayProductoException NoHayProductoException){
            System.out.println("El deposito está vacio o se introdujo un numero de producto erroneo\n");
        }
    }
}