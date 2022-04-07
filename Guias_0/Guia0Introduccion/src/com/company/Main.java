package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args)
    {
        sc = new Scanner(System.in);

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
    }

    public static void ejercicio1()
    {
        int N = 15;
        float A = 15.15F;
        char C = 'z';

        float sumaN_A = (float)N + A;
        float difA_N = A - (float)N;

        int ascii_C = 'z';
        int ascii_C2 = C;

        System.out.println("El valor de N: " + N);
        System.out.println("El valor de A: " + A);
        System.out.println("El caracter de C: " + C);

        System.out.println("La suma de N+A es: " + sumaN_A);
        System.out.println("La suma de N+A es: " + ((float)N + A));

        System.out.println("La resta de A-N es: " + difA_N);
        System.out.println("La resta de A-N es: " + (A - (float)N));

        System.out.println("El valor ASCII de '" + C + "' es: " + (int)C);
        System.out.println("El valor ASCII del caracter C es: " + ascii_C);
        System.out.println("El valor ASCII de '" + C + "' es: " + ascii_C2);
    }
    public static void ejercicio2()
    {
        int X = 10;
        int Y = 20;
        float N = 5.3F;
        float M = 7.7F;

        System.out.println(X + "*" + Y + "=" + X * Y);
        System.out.println(X + "*" + N + "=" + (float)X * N);
        System.out.println(M + "/" + N + "=" + M / N);
        System.out.println(Y + "/" + M + "=" + (float)Y / M);
        System.out.println(Y + "*" + M + "=" + (float)Y * M);
        System.out.println(Y + " % " + M + " = " + (float)Y % M);
    }
    public static void ejercicio3()
    {
        int N = 23;
        N+= 77;
        System.out.println("N = " + N);
        N -= 3;
        System.out.println("N = " + N);
        N *= 2;
        System.out.println("N = " + N);
    }
    public static void ejercicio4()
    {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        System.out.println("Valores antes de modificacion: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
        System.out.println("Valores luego de modificacion: A = " + D + ", B = " + C + ", C = " + A + ", D = " + B);
    }
    public static void ejercicio5()
    {
        int A = 8;

        if (A % 2 == 0)  System.out.println("El numero " + A + " es par");
        else System.out.println("El numero " + A + " es impar");
    }
    public static void ejercicio6()
    {

        int num = -1;
        if (num >= 0) {
            System.out.println(num + " es positivo");
        } else {
            System.out.println(num + " es negativo");
        }
    }
    public static void ejercicio7()
    {
        int C = 110;
        if (C >= 0)
        {
            System.out.println("El numero " + C + " es positivo");
        }
        else
        {
            System.out.println("El numero " + C + " es negativo");
        }

        System.out.println("Tambien es" + (C % 2 == 0 ? " par" : " impar"));
        System.out.println(C % 5 == 0 ? "Multiplo de 5" : "No multiplo de 5");
        System.out.println(C % 10 == 0 ? "Multiplo de 10" : "No multiplo de 10");
        System.out.println(C >= 100 ? "Y Mayor o igual que 100" : "Menor que 100");
    }
    public static void ejercicio8()
    {
        sc.reset();
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Buenos dias " + nombre);
    }
    public static void ejercicio9()
    {
        sc.reset();
        System.out.println("Number: ");
        int num = sc.nextInt();
        int doubleOf = num * 2;
        int triple = num * 3;
        System.out.println("Double of " + num + " is " + doubleOf);
        System.out.println("Triple of " + num + " is " + triple);
        System.out.println("Double of " + num + " is " + 2 * num);
        System.out.println("Triple of " + num + " is " + 3 * num);
    }
    public static void ejercicio10()
    {
        sc.reset();
        System.out.println("Temperature: ");
        float Fahrenheit = sc.nextFloat();
        float Celsius = (Fahrenheit - 32.0F) / 1.8F;
        System.out.println(Fahrenheit + " fahrenheit degrees are " + Celsius + " celsius degrees");
    }
    public static void ejercicio11()
    {
        sc.reset();

        System.out.println("Radius: ");
        float radius = sc.nextFloat();

        float diameter = 2 * radius;
        double circumference =  Math.PI * diameter;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Circumference lenght: " + circumference);
        System.out.println("Circumference area: " + area);
    }
    public static void ejercicio12()
    {
        sc.reset();
        System.out.println("Speed in km/h to m/s: ");
        float ms = sc.nextFloat();
        float km = ms / 3.6F;
        System.out.println(ms + " m/s are " + km + " km/h");
    }
    public static void ejercicio13()
    {
        sc.reset();
        System.out.println("Longitud del primer cateto: ");
        float cateto1 = sc.nextFloat();
        System.out.println("Longitud del segundo cateto: ");
        float cateto2 = sc.nextFloat();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Hipotenusa: " + hipotenusa);
    }
    public static void ejercicio14()
    {
        sc.reset();
        System.out.println("Radius: ");
        float radius = sc.nextFloat();
        double volume = 4.0/3 *Math.PI* Math.pow(radius,3);
        System.out.println("Volume of the sphere: " + volume);
    }
    public static void ejercicio15()
    {
        sc.reset();

        System.out.println("First side: ");
        float side1 = sc.nextFloat();
        System.out.println("Second side: ");
        float side2 = sc.nextFloat();
        System.out.println("Third side: ");
        float side3 = sc.nextFloat();

        float SphSemiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(SphSemiPerimeter * (SphSemiPerimeter - side1) * (SphSemiPerimeter - side2) * (SphSemiPerimeter - side3));

        System.out.println("Triangle area: " + area);
    }
    public static void ejercicio16()
    {
        sc.reset();

        System.out.println("Three digit number: ");
        int num = sc.nextInt();
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        System.out.println("First digit: " + first);
        System.out.println("Second digit: " + second);
        System.out.println("Third digit: " + third);
    }
    public static void ejercicio17()
    {
        sc.reset();
        System.out.println("Five digits number: ");
        int num = sc.nextInt();
        int first = num / 10000;
        int second = num / 1000 % 10;
        int third = num / 100 % 10;
        int fourth = num / 10 % 10;
        int fifth = num % 10;
        System.out.println("First digit: " + first);
        System.out.println("Third digit: " + third);
        System.out.println("Fifth digit: " + fifth);
    }
    public static void rehaciendoEjercicio17()
    {
        int digits = 0;
        String digitVerif = null;

        while(digits != 5)
        {
            sc.reset();
            System.out.println("Ingrese un numero de 5 cifras: ");
            int num = sc.nextInt();
            digitVerif = Integer.toString(num);
            digits = digitVerif.length();
            if (digits != 5) {
                System.out.println("El numero ingresado no tiene 5 cifras");
            }
        }
        for(int i = 0; i < 5; ++i)
        {
            if (i % 2 != 0)
            {
                System.out.println("Digito en posicion impar [" + i + "] = " + digitVerif.charAt(i));
            }
        }
    }
    public static void ejercicio18()
    {
        sc.reset();
        System.out.println("Ingrese hora: ");
        int H = sc.nextInt();
        sc.reset();
        System.out.println("Ingrese minutos: ");
        int M = sc.nextInt();
        sc.reset();
        System.out.println("Ingrese segundos: ");
        int S = sc.nextInt();

        if (H >= 0 && H <= 23 && M >= 0 && M <= 59 && S >= 0 && S <= 59)
        {
            System.out.println("La hora ingresada es valida: " + H + ":" + M + ":" + S);
        }
        else
        {
            System.out.println("La hora ingresada no es valida");
        }
    }
}