import util.Autor;
import util.Cliente;
import util.Factura;
import util.Libro;

public class Main {

    public static void main(String[] args) {
        //Ej1();
        Ej2();


    }
    public static void Ej1(){
        Autor autorJoshua = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        /*
        System.out.println(autorJoshua);
        Libro libroEffective = new Libro("Effective Java",450, 150, autorJoshua);
        System.out.println(libroEffective);
        libroEffective.setPrecio(500);
        libroEffective.setStock(libroEffective.getStock()+50);
        System.out.println(libroEffective.getAutor());
        */
        Autor autorPepe = new Autor("Pepe", "Castaño", "pepecastaño@email.com", 'M');

        Autor[]autores = new Autor[10];
        autores[0] = autorJoshua;
        autores[1] = autorPepe;

        Libro libroEffective = new Libro("Effective Java",450, 150, autores);
        System.out.println(libroEffective.mostrarAutores());
    }
    public static void Ej2(){
        Cliente clientePedro= new Cliente("Pedro", "pedroemail@gmail.com", 15);
        System.out.println(clientePedro);

    }
}
