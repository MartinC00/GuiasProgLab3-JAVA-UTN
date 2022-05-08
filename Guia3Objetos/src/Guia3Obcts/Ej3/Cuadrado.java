package Guia3Obcts.Ej3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(){
        super(1,1);
    }
    public Cuadrado(String color, double lado){
        super(color, lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "color='" + color + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
