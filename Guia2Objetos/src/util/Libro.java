package util;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    Autor autor;

    public Libro(String titulo, double precio, int stock, Autor autor){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autor=autor;
    }


    /* Mostrar objeto antes del punto g
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }*/
    @Override
    public String toString(){
        return "El libro "+titulo+" de "+ getAutor().getNombre()+" "+getAutor().getApellido()+" se vende a "+precio+" pesos.";
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
