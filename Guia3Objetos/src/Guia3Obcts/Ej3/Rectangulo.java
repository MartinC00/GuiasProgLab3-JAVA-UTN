package Guia3Obcts.Ej3;

public class Rectangulo extends Figura {

    protected double base;
    protected double altura;

    public Rectangulo(){
        this.base=4;
        this.altura=2;
    }
    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }
    public Rectangulo(String color, double altura, double base){
        super(color);
        this.altura=altura;
        this.base=base;
    }

    //G&S
    public double getAlto() {
        return altura;
    }
    public void setAlto(double alto) {
        this.altura = alto;
    }
    public double getAncho() {
        return base;
    }
    public void setAncho(double ancho) {
        this.base = ancho;
    }


    @Override
    public double calcularArea() {
        return altura*base;
    }
    @Override
    public double calcularPerimetro() {
        return (altura*2+base*2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color='" + color + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}