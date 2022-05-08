package Guia3Obcts.Ej3;

public class Circulo extends Figura {
    private double radio;

    public Circulo(){
        this.radio=2;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public Circulo(double radio, String color){
        super(color);
        this.radio=radio;
    }
    @Override
    public double calcularArea(){
        return (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2*radio*Math.PI);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
