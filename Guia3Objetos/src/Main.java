import Guia3Obcts.Ej1.*;
import Guia3Obcts.Ej2.*;
import Guia3Obcts.Ej3.*;
import Guia3Obcts.Ej3.Circulo;
import Guia4Objcts.*;
import RepasoTolo.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Guia3Ej1();
        //Guia3Ej2();
        //Guia3Ej3();
        //Guia4();
        EjercicioRepasoTolo();


    }
    public static void Guia3Ej1(){
        Cilindro cilindro1 = new Cilindro();

        System.out.println("Cilindro 1: "+cilindro1);
        System.out.println("Cilindro 1 radio: "+cilindro1.getRadio());
        System.out.println("Cilindro 1 altura: "+cilindro1.getAltura());
        System.out.println("Cilindro 1 area: "+cilindro1.calcularArea());
        System.out.println("Cilindro 1 volumen: "+cilindro1.calcularVolumen());

        Cilindro cilindro2 = new Cilindro(5.3, 3.2);

        System.out.println("Cilindro 2: "+cilindro2);
        System.out.println("Cilindro 2 radio: "+cilindro2.getRadio());
        System.out.println("Cilindro 2 altura: "+cilindro2.getAltura());
        System.out.println("Cilindro 2 area: "+cilindro2.calcularArea());
        System.out.println("Cilindro 2 volumen: "+cilindro2.calcularVolumen());
    }
    public static void Guia3Ej2(){

        Estudiante estudiante1=new Estudiante("Pedro","X", "12345678", "asd 1500", "pedroemail@mail", "2015", 5000,"TUP");
        Estudiante estudiante2=new Estudiante("Juan","Y", "11345678", "abc 1320", "juanemail@mail", "2016", 6000,"ING NAV");
        Estudiante estudiante3=new Estudiante("Mateo","Z", "22345678", "bnm 1120", "mateoemail@mail", "2017", 7000,"ING PESQ");
        Estudiante estudiante4=new Estudiante("Ramiro","A", "33345678", "klg 250", "ramiroemail@mail", "2018", 8000,"MAT");

        Staff staff1 = new Staff("Olivia", "A", "12345666","oliviaemail@mail","qwer 3000", 35000, "Noche");
        Staff staff2 = new Staff("Juana", "B", "12345999","juanaemail@mail","qwer 3100", 30000, "Noche");
        Staff staff3 = new Staff("Rodolfo", "D", "12345622","rodolfoemail@mail","dfgd 400", 29000, "Mañana");
        Staff staff4 = new Staff("Pepa", "C", "12345611","pepaemail@mail","tdfg 1231", 31000, "Mañana");

        ArrayList <Persona> institucion = new ArrayList<>();
        institucion.add(estudiante1);
        institucion.add(estudiante2);
        institucion.add(estudiante3);
        institucion.add(estudiante4);
        institucion.add(staff1);
        institucion.add(staff2);
        institucion.add(staff3);
        institucion.add(staff4);

        int contEst=0, contStaff=0;

        for(Persona persona : institucion){
            if(persona instanceof Estudiante){
                contEst++;
            }
            else if(persona instanceof Staff){
                contStaff++;
            }
        }

        System.out.println("En el array hay: "+contEst+" estudiantes y "+contStaff+" miembros de staff.");
        int ingresoMensual=0;
        for(Persona persona: institucion){
            if(persona instanceof Estudiante){
                ingresoMensual+=((Estudiante) persona).getCuotaMensual();
            }
        }
        System.out.println("La institucion percibe $"+ingresoMensual+" mensualmente por parte de la cuota de los estudiantes.");
    }
    public static void Guia3Ej3(){

        Circulo circDefecto= new Circulo();
        Circulo circDefinido= new Circulo(5, "Azul");
        Circulo circNoColor= new Circulo(5);

        Rectangulo recDefecto = new Rectangulo();
        Rectangulo recDefinido = new Rectangulo("Naranja", 5, 10);
        Rectangulo recNoColor = new Rectangulo (15, 10);

        System.out.println(circDefecto);
        System.out.println(circDefinido);
        System.out.println(circNoColor);
        System.out.println(recDefecto);
        System.out.println(recDefinido);
        System.out.println(recNoColor);
    }
    public static void Guia4(){

        VideoStore videoStore = new VideoStore();
        Pelicula Spiderman = new Pelicula("Spiderman", LocalDate.of(2008,7, 15), 120,Audiencia.PG ,Genero.ACCION, "USA", "Hay arañas", 3);
        Pelicula prueba1 = new Pelicula("Prueba 1", LocalDate.of(2000,5, 5), 100,Audiencia.NC17 ,Genero.DOCUMENTAL, "USA", "abcdefg", 1);
        Pelicula prueba2 = new Pelicula("Prueba 2", LocalDate.of(2001,7, 15), 90,Audiencia.UNRATED ,Genero.AVENTURA, "USA", "qwertyuio", 0);

        videoStore.agregarPelicula(Spiderman);
        videoStore.agregarPelicula(prueba1);

        videoStore.agregarCliente("Pedro","123456789" ,"algun lugar 3200");

        videoStore.alquilerDePelicula("Spiderman", "Pedro");

        videoStore.consultaAlquileres();


    }
    public static void EjercicioRepasoTolo(){

        Libro libro1 = new Libro("LibroEj1", "2010",true, GeneroLibro.FANTASIA);
        Libro libro2 = new Libro("LibroEj2", "2015",true, GeneroLibro.CUENTOS);
        Libro libro3 = new Libro("LibroEj3", "2020",false,GeneroLibro.POLICIAL);

        Revista revista1 = new Revista("RevistaEj1", "2011", true);
        Revista revista2 = new Revista("RevistaEj2", "2013", false);
        Revista revista3 = new Revista("RevistaEj3", "2015", true);

        Diario diario1 = new Diario("DiarioEj1", "2000", false);
        Diario diario2 = new Diario("DiarioEj2", "2001", true);
        Diario diario3 = new Diario("DiarioEj3", "2002", true);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregaEjemplar(libro1);
        biblioteca.agregaEjemplar(libro2);
        biblioteca.agregaEjemplar(libro3);
        biblioteca.agregaEjemplar(revista1);
        biblioteca.agregaEjemplar(revista2);
        biblioteca.agregaEjemplar(revista3);
        biblioteca.agregaEjemplar(diario1);
        biblioteca.agregaEjemplar(diario2);
        biblioteca.agregaEjemplar(diario3);

        System.out.println("Alquilo libro1. Operacion exitosa: "+biblioteca.alquilarEjemplar("LibroEj1")); //Tambien podria mandar el libro pero me parecio mas realista hacerlo con el titulo
        System.out.println("Devuelvo libro1. Operacion exitosa: "+biblioteca.devolverEjemplar("LibroEj1"));

        System.out.println("Alquiler libro3 que ya esta alquilado. Operacion exitosa: "+biblioteca.alquilarEjemplar("LibroEj3"));
        System.out.println("Devolver revista1 que ya esta devuelta. Operacion exitosa: "+biblioteca.devolverEjemplar("RevistaEj1"));
        System.out.println("Alquilar diario1. Operacion exitosa:  "+biblioteca.alquilarEjemplar("DiarioEj1"));

        System.out.println(biblioteca);


    }
}
