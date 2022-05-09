public class Acustica extends Cuerda implements Aumento{

    private Madera madera;
    public Acustica(){}
    public Acustica(String marca, double precio, Madera madera){
        super(marca, precio, 6);
        this.madera=madera;
    }

    public Madera getMadera() {
        return madera;
    }

    public void setMadera(Madera madera) {
        this.madera = madera;
    }

    @Override
    public double aumentoPrecio(int porcentaje){
        double precio = getPrecio()+(getPrecio()*((double)porcentaje/100));
        setPrecio(precio);
        return precio;
    }

    @Override
    public String toString() {
        return "Acustica{" +
                "madera=" + madera +
                ", cuerdas=" + cuerdas +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
