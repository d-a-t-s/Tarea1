package paquete;
/*
* Clase abstracta Moneda representa una moneda genérica
* Se implementa la infertez Comparable para comparar monedas por su valor.
* */

public abstract class Moneda implements Comparable<Moneda>{
    /*
    * Constructor de clase Moneda
    * */
    public Moneda(){
    }
    /*
    * Compara la moneda This con otra moneda por su valor
    * @param moneda La moneda con la que se va a comparar
    * @return Valor positivo si la (this)moneda es mayor a la moneda proporcionada,
    *         Valor cero si ambas monedas tienen el mismo valor,
    *         Valor negativo si la (this)moneda es menor a la moneda proporcionada.
    * */
    public int compareTo(Moneda moneda) {
        return this.getValor() - moneda.getValor();
    }

    /*
    * Devuelve la serie de la moneda (direccion)
    * @return Serie (direccion de la moneda)
    * */

    public Moneda getSerie(){
        return this;
    }

    /*
    * Devuelve el valor de moneda
    * */
    public abstract int getValor();
}