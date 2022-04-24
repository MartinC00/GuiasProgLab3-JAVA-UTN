package Guia3Objcts.Ej1;

public class Circulo {
    protected String color = "rojo";
    protected double radio = 1.0;

    public Circulo(){}
    public Circulo(double radio){
        this.radio=radio;
    }
    public Circulo(double radio, String color){
        this.radio=radio;
        this.color=color;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
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
