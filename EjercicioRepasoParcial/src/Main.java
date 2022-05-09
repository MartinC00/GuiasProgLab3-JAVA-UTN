import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Instrumento> instrumentos = new ArrayList<>();

        instrumentos.add(new Electrica("Gibson", 70000, "Les Paul 60s"));
        instrumentos.add(new Acustica("Yamaha",50000, Madera.CAOBA));
        instrumentos.add(new Bajo("Sterling", 68000, "Music Man Stingray Ray4"));
        instrumentos.add(new Bateria("Pearl", 4, 5));

        System.out.println(instrumentos);

        for(Instrumento instrumento : instrumentos){
            if(instrumento!=null){
                if(instrumento instanceof Electrica){
                    ((Electrica)instrumento).aumentoPrecio(5);
                }
                else if(instrumento instanceof Acustica){
                    ((Acustica)instrumento).aumentoPrecio(10);
                }
                else if(instrumento instanceof Bajo){
                    ((Bajo)instrumento).aumentoPrecio(20);
                }
                else
                    ((Bateria)instrumento).aumentoPrecio(15);
            }
        }
        System.out.println("Despues de aumentos...\n"+instrumentos);

    }
}
