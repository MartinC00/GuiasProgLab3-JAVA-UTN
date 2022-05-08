package Guia4Objcts;
import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate fechaLanzamiento;
    private int duracion; //Minutos
    private String descripcion;
    private int stock;
    private Genero genero;
    private Audiencia audiencia;
    private String pais;

    public Pelicula(){}
    public Pelicula(String titulo, LocalDate fechaLanzamiento, int duracion, Audiencia audiencia, Genero genero, String pais, String descripcion, int stock){

        this.titulo=titulo;
        this.fechaLanzamiento=fechaLanzamiento;
        this.duracion=duracion;
        this.descripcion=descripcion;
        this.stock=stock;
        this.audiencia=audiencia;
        this.genero=genero;
        this.pais=pais;
    }

    //G&S
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Genero getGenero() { return genero;  }

    public void setGenero(Genero genero) { this.genero = genero; }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", genero=" + genero +
                ", audiencia=" + audiencia +
                ", pais='" + pais + '\'' +
                '}';
    }
}
