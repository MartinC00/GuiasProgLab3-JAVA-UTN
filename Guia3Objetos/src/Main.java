
import Guia3Objcts.Ej1.Cilindro;
import Guia3Objcts.Ej2.Estudiante;
import Guia3Objcts.Ej2.Persona;
import Guia3Objcts.Ej2.Staff;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Guia2Ej1();
        //Guia2Ej2();
        Guia2Ej3();



    }
    public static void Guia2Ej1(){
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
    public static void Guia2Ej2(){

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
    public static void Guia2Ej3(){

    }
}
