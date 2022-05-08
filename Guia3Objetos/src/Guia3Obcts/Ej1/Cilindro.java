package Guia3Obcts.Ej1;

public class Cilindro extends Circulo{

    private double altura=1.0;

    public Cilindro(){}
    public Cilindro(double altura, double radio){
        super(radio);
        this.altura=altura;
    }
    public Cilindro(String color, double altura, double radio){
        super(radio, color);
        this.altura=altura;
    }
    @Override
    public double calcularArea(){
        return (2*Math.PI*super.getRadio()*altura+2*super.calcularArea());
    }

    public double calcularVolumen(){
        return super.calcularArea() * altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de {" +super.toString()+
                "} altura =" + altura;
    }
}
