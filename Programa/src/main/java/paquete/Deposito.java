package paquete;
import java.util.ArrayList;
/*
* Clase deposito, Arreglo donde se guardaran todos los objetos
* */
public class Deposito<T> {
    private ArrayList<T> deposito;

    /*
    * Constructor de Deposito se instancia un nuevo objeto
    *
    * @param ncantidad  Cantidad de productos que tendra el deposito
    * */
    public Deposito(int ncantidad){
        this.deposito = new ArrayList<>(ncantidad);
    }

    /*
    *  addObjeto  Agrega un objeto al deposito/array en el que estamos trabajando
    *
    *  @param t  Es un objeto cualquiera que entra en el deposito/array
    * */
    public void addObjeto(T t){
        deposito.add(t);
    }

    /*
    *  getObjeto  Saca el primer objeto del deposito/array y si el array esta vacia nos devuelve el nulo
    *
    *   @return Primer objeto del array, y nulo en el caso de no haber objetos
    * */
    public T getObjeto(){
        if(deposito.isEmpty()) {
            return  null;
        }
        return deposito.remove(0);
    }
}
