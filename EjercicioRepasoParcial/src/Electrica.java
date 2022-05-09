public class Electrica extends Cuerda implements SonidoAmplificado, Aumento{

    private String modelo;
    public Electrica(){}
    public Electrica(String marca, double precio, String modelo){
        super(marca, precio, 6);
        this.modelo=modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double aumentoPrecio(int porcentaje){
        double precio = getPrecio()+(getPrecio()*((double)porcentaje/100));
        setPrecio(precio);
        return precio;
    }

    @Override
    public String toString() {
        return "Guitarra Electrica: [" +
                "cuerdas=" + cuerdas +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ']';
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println("Guitarra Electrica: SONIDO AMPLIFICADO");
    }
}
