package util;

public class Rectangulo {

    private double alto=1.0;
    private double ancho=1.0;

    public Rectangulo(){}

    public Rectangulo(double alto, double ancho){
        if(ancho>alto) { this.alto=alto; this.ancho=ancho; }
    }

    //Methods
    public double getArea(){
        return this.alto*this.ancho;
    }
    public double getPerimetro(){
        return (this.alto*2+this.ancho*2);
    }

    //G&S
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        if(alto < this.ancho) this.alto = alto; //Comprobacion al main?
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        if(ancho > this.alto) this.ancho = ancho;
    }

    @Override
    public java.lang.String toString() {
        return "Rectangulo: alto= " + alto +", ancho= " + ancho;
    }
}