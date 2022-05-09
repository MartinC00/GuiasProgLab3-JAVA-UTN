public abstract class Cuerda extends Instrumento {

    protected int cuerdas;

    public Cuerda(){}
    public Cuerda(String marca, double precio, int cuerdas) {
        super(marca, precio);
        this.cuerdas = cuerdas;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public String toString() {
        return "Cuerda{" +
                "cuerdas=" + cuerdas +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
