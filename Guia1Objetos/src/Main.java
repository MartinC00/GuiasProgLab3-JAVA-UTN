import Objects.Ejercicio1.Rectangulo;
import Objects.Ejercicio2.Empleado;
import Objects.Ejercicio3.ItemDeVenta;
import Objects.Ejercicio4.Cuenta;
import Objects.Ejercicio5.Hora;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n------------------------- EJERCICIO 1 ---------------------------------\n");
        Ej1();

        System.out.println("\n------------------------- EJERCICIO 2 ---------------------------------\n");
        Ej2();

        System.out.println("\n------------------------- EJERCICIO 3 ---------------------------------\n");
        Ej3();

        System.out.println("\n------------------------- EJERCICIO 4 ---------------------------------\n");
        Ej4();

        System.out.println("\n------------------------- EJERCICIO 5 ---------------------------------\n");
        Ej5();
    }
    public static void Ej1() {
        Rectangulo rectangulo0 = new Rectangulo(5.2,8.3);

        System.out.println(rectangulo0); //
        System.out.println("Area: "+rectangulo0.getArea());
        System.out.println("Perimetro: "+rectangulo0.getPerimetro());

        rectangulo0.setAlto(3);
        rectangulo0.setAncho(4);
        System.out.println(rectangulo0);
        System.out.println("Area: "+rectangulo0.getArea());
        System.out.println("Perimetro: "+rectangulo0.getPerimetro());

        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println(rectangulo1);
    }
    public static void Ej2() {
        Empleado empleado1 = new Empleado("Carlos", "Gutiérrez", 23456345, 25000);
        Empleado empleado2 = new Empleado("Ana", "Sánchez", 34234123, 27500);
        System.out.println(empleado1);
        System.out.println(empleado2);
        empleado1.aumentaSalario(15);
        System.out.println("Luego del aumento del 15%, carlos cobra ANUALMENTE... "+empleado1.salarioAnual());
    }
    public static void Ej3(){
        ItemDeVenta item = new ItemDeVenta(1, "Cuchillo", 10, 105);
        System.out.println(item);
    }
    public static void Ej4(){
        Cuenta cuenta = new Cuenta(1, "cuentaPrueba", 15000);

        System.out.println("Se hizo un deposito, el saldo es: "+cuenta.credito(2500));
        System.out.println("Se hizo una compra, el saldo es: "+cuenta.debito(1500));
        System.out.println("Se hizo una compra, el saldo es: "+cuenta.debito(30000));

        System.out.println(cuenta);
    }
    public static  void Ej5(){
        Hora horario = new Hora(1,59,61);
        System.out.println(horario);

        horario.retrocedeSegundo();
        System.out.println("Se retrocedio 1 segundo... "+horario);
        horario.avanzaMinuto();
        System.out.println("Se avanzo 1 minuto... "+horario);
        horario.avanzaSegundo();
        System.out.println("Se avanzo 1 segundo... "+horario);
        horario.retrocedeHora();
        System.out.println("Se retrocedio 1 hora... "+horario);
        horario.retrocedeSegundo();
        System.out.println("Se retrocedio 1 segundo... "+horario);
        horario.retrocedeHora();
        System.out.println("Se retrocedio 1 hora... "+horario);

    }
}
