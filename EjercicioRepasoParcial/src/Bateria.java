public class Bateria extends Instrumento implements Aumento{

    private int tambores;
    private int platillos;

    public Bateria(){}
    public Bateria(String marca, int tambores, int platillos) {
        super(marca,3000*tambores+2000*platillos);
        this.tambores = Math.max(tambores, 3);
        this.platillos = platillos >= 1 && platillos <=5 ? platillos : 1;
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public int getPlatillos() {
        return platillos;
    }

    public void setPlatillos(int platillos) {
        this.platillos = platillos;
    }

    @Override
    public double aumentoPrecio(int porcentaje){
        double precio = getPrecio()+(getPrecio()*((double)porcentaje/100));
        setPrecio(precio);
        return precio;
    }

    @Override
    public String toString() {
        return "Bateria: [" +
                "tambores=" + tambores +
                ", platillos=" + platillos +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ']';
    }
}
