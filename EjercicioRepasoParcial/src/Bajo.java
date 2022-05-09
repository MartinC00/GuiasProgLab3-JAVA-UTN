public class Bajo extends Cuerda implements SonidoAmplificado, Aumento{

    private String modelo;
    public Bajo(){}
    public Bajo(String marca, double precio, String modelo){
        super(marca, precio, 4);
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
        return "Bajo: [" +
                "modelo='" + modelo + '\'' +
                ", cuerdas=" + cuerdas +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ']';
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println("Bajo: SONIDO AMPLIFICADO");
    }
}
