package paquete;

public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
    }

    public int compareTo(Moneda moneda) {
        return this.getValor() - moneda.getValor();
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}
