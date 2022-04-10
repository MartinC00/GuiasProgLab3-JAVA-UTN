import util.Autor;
import util.Libro;

public class Main {

    public static void main(String[] args) {
        Autor autorJoshua = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autorJoshua);
        Libro libroEffective = new Libro("Effective Java",450, 150, autorJoshua);
        System.out.println(libroEffective);
        libroEffective.setPrecio(500);
        libroEffective.setStock(libroEffective.getStock()+50);
        System.out.println(libroEffective.getAutor());

    }
}
