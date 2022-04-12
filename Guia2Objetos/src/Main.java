import Objects.Ejercicio1.*;
import Objects.Ejercicio2.*;
import Objects.Ejercicio3.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        //Ej1();
        //Ej2();
       Ej3();


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

        /*Incompatibles con punto e
        Factura factura = new Factura(1500, clientePedro);
        System.out.println("Monto total de la factura: $"+factura.getMonto());
        System.out.println("Monto de la factura con descuento de cliente: $"+factura.facturaConDescuento());
        System.out.println(factura);
        */
        ItemDeVenta []array = new ItemDeVenta[10];
        ItemDeVenta cuchillo = new ItemDeVenta(1, "Cuchillo", 5, 500);
        ItemDeVenta tenedor = new ItemDeVenta(2, "Tenedor", 3, 400);
        array[0]=cuchillo;
        array[1]=tenedor;
        Factura factura = new Factura(1500, clientePedro, array);
        System.out.println("Monto total de factura con items sin descuento: $"+factura.montoTotalSinDescuento());
        System.out.println("Monto total de factura con items con descuento: $"+factura.montoTotalConDescuento());
    }
    public static void Ej3(){
        ClienteCuenta clienteRafa= new ClienteCuenta("Rafael", "1H", 'M');
        System.out.println(clienteRafa);

        String[] registroOperaciones = new String[10];
        Cuenta cuenta = new Cuenta("A10",10000, clienteRafa, registroOperaciones);

        System.out.println("El balance inicial de la cuenta es: "+cuenta.getBalance());

        System.out.println("Extraccion de 20000, balance: "+cuenta.Extraer(20000));
        System.out.println("Extraccion de 9000, balance: "+cuenta.Extraer(9000));
        System.out.println("Deposito de 500, balance: "+cuenta.Depositar(500));

        System.out.println("Extraccion deudora de 8000, balance: "+cuenta.ExtraerDeudor(8000));
        System.out.println("Extraccion deudora de 3500, balance: "+cuenta.ExtraerDeudor(3500));

        System.out.println("Deposito de 8500, balance: "+cuenta.Depositar(8500));
        System.out.println("Extraccion deudora de 5000, balance: "+cuenta.ExtraerDeudor(5000));
        System.out.println("Extraccion deudora de 3000, balance: "+cuenta.ExtraerDeudor(3000));
        System.out.println("Deposito de 3000, balance: "+cuenta.Depositar(3000));
        System.out.println("Deposito de 3000, balance: "+cuenta.Depositar(3000));
        System.out.println("Extraccion deudora de 5000, balance: "+cuenta.ExtraerDeudor(5000));
        System.out.println("Extraccion deudora de 5000, balance: "+cuenta.ExtraerDeudor(5000));
        System.out.println("Deposito de 3000, balance: "+cuenta.Depositar(3000));

        //Operacion numero 11, no se guarda en el registro pero no se rompe
        System.out.println("OPERACION 11, no se guarda. Deposito de 500, balance: "+cuenta.Depositar(500));



        System.out.println(cuenta);





    }
}
