package com.company;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer>arrayNumeros= new ArrayList<>();

    public static void main(String[] args)
    {
        ejercicio1();
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
    }

    public static void ejercicio1()
    {
        sc.reset();
        System.out.println("Ingrese numero de mes: ");
        int mes = sc.nextInt()-1;

        int[] meses = new int[12];

        for(int i=0; i<12; i++)
        {
            if(i<=6) //enero-julio
            {
                if(i==1)
                {
                    meses[i]=28;
                }
                else if(i%2==0)
                {
                    meses[i]=31;
                }
                else
                {
                    meses[i]=30;
                }
            }
            else //agosto-diciembre
            {
                if(i%2==0)
                {
                    meses[i]=30;
                }
                else
                {
                    meses[i]=31;
                }
            }
        }
        if(mes >=0 && mes <=11)
        {
            int i=0;
            while(i != mes)
            {
                i++;
            }
            System.out.println("El mes numero "+(mes+1)+" tiene "+meses[i]+" dias");
        }
        else
        {
            System.out.println("El numero de mes ingresado no esta entre 1 y 12");
        }
    }
    public static void ejercicio2()
    {
        int i=1;
        while(i<101)
        {
            System.out.println(i++);
        }
    }
    public static void ejercicio3()
    {
        int i=1;
        do {
            System.out.println(i++);
        }
        while(i<=100);
    }
    public static void ejercicio4()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println(i);
        }
    }
    public static void ejercicio5()
    {
        int[]array = new int[10];
        int positivos=0, negativos=0, ceros=0;
        for(int i=0; i<10; i++)
        {
            if(array[i]==0) ceros++;
            else if(array[i]%2==0) positivos++;
            else negativos++;
        }
    }
    public static void ejercicio6()
    {
        int []arr = new int [10];
        for(int i=0; i<10; i++)
        {
            arr[i]= (int) (Math.random()*100+1);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void ejercicio7()
    {
        int [] arr = new int[20];
        int num;

        for(int i=0; i<20; i++)
        {
            num=1;
            while(num%2!=0)
            {
                num = (int)(Math.random()*100+1);
            }
            arr[i]=num;
        }
        for(int i=0; i<20; i++) System.out.println(arr[i]);
    }
    public static void ejercicio8()
    {
        int i=0;
        float altura, sumatoriaAlturas = 0;

        ArrayList<Float>arrayAlturas = new ArrayList<>();
        String seguir ="si";

        while(seguir.toLowerCase().equals("si"))
        {
            System.out.println("Ingrese altura del alumno "+(i+1));
            i++;
            arrayAlturas.add(sc.nextFloat());
            System.out.println("Desea seguir cargando alumnos? Ingrese si o no");
            sc.nextLine();
            seguir = sc.nextLine();
        }
        i=0;
        while(i<arrayAlturas.size())
        {
            sumatoriaAlturas+=arrayAlturas.get(i);
            i++;
        }
        float mediaAlturas = sumatoriaAlturas/arrayAlturas.size();

        System.out.println("La media de alturas es: "+mediaAlturas);
    }
    public static void ejercicio9()
    {
        int num = 0, sumatoria=0, mayoresMedia=0;

        while (num != -99)
        {
            System.out.println("Ingrese numero: ");
            num = sc.nextInt();

            if(num!=-99)
            {
                arrayNumeros.add(num);
                sumatoria+=num;
            }
        }

        float media = (float) (sumatoria/arrayNumeros.size());

        for (int i = 0; i < arrayNumeros.size(); i++)
        {
            if(arrayNumeros.get(i)>media)
            {
                mayoresMedia++;
            }
        }
        System.out.println("Suma: "+sumatoria);
        System.out.println("Media: "+media);
        System.out.println("Mayores que la media: "+mayoresMedia);
    }
    public static void ejercicio10()
    {
        arrayNumeros.add(1);
        arrayNumeros.add(2);
        arrayNumeros.add(3);
        arrayNumeros.add(4);
        arrayNumeros.add(5);

        Collections.reverse(arrayNumeros);

        for(int i=0; i<arrayNumeros.size(); i++)
        {
            System.out.println(arrayNumeros.get(i));
        }
    }
    public static void ejercicio11()
    {
        ArrayList<String>arrStrings = new ArrayList<>();
        arrStrings.add("Hola mundo");
        arrStrings.add("Hola mundo como");
        arrStrings.add("Hola mundo como estas");
        arrStrings.add("Hola mundo como estas ZZZZZZZZ");

        System.out.println(Collections.max(arrStrings));
    }
}
