package util;

import java.util.Arrays;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    public Libro(){};

    /* PARA ANTES DEL INCISO H
    public Libro(String titulo, double precio, int stock, Autor autor){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autor=autor;
    }*/

    //Para inciso h
    public Libro(String titulo, double precio, int stock, Autor[] autores){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autores=autores;
    }


    /* Mostrar libro antes del punto g
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }*/

    /*Mostrar libro para punto g
    @Override
    public String toString(){
        return "El libro "+titulo+" de "+ getAutor().getNombre()+" "+getAutor().getApellido()+" se vende a "+precio+" pesos.";
    }*/

    //Mostrar libro para punto h
    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", precio=" + precio +", stock=" + stock +", autores=" + Arrays.toString(autores) +'}';
    }
    public String mostrarAutores(){
        StringBuilder autoresReales = new StringBuilder();

        autoresReales.append("\n");
        for(Autor autor: autores){
            if(autor != null){
                autoresReales.append(autor.getNombre()).append(" ").append(autor.getApellido());
                autoresReales.append("\n");
            }
        }
        return "En el libro: '"+getTitulo()+"' trabajaron los siguientes autores: "+autoresReales;
    }

    //G&S
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //G&S incompatibles con punto h
    //public Autor getAutor() { return autor; }
    //public void setAutor(Autor autor) { this.autor = autor;}
}
