package com.company;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String frase;
    public static void main(String[] args) {

    //ejercicio1();
    ejercicio2();
    //ejercicio3();
    //ejercicio4();
    //ejercicio5();

    }
    public static void ejercicio1(){

        frase = "Buen dia como estas";
        StringTokenizer strTok = new StringTokenizer(frase);
        int contador = strTok.countTokens();
        System.out.println("Cantidad de palabras de la frase '"+frase+"' es: "+contador);
    } // Contar el numero de palabras de una frase en español

    public static void ejercicio2(){ //Contar el numero de oraciones de una frase en español.

        //??

    }
    public static void ejercicio3(){ // Contar el numero de sılabas de una palabra en español.

        frase = "Hola";
        StringTokenizer strTok = new StringTokenizer(frase);


    }
    public static void ejercicio4(){ // Eliminar la ultima palabra de una frase.



    }
    public static void ejercicio5(){ // Contar el numero de veces que aparece un caracter en un texto.



    }
}
