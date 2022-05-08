package Guia4Objcts;

import java.time.LocalDate;
import java.util.UUID;

public class BoletaPrestamo {

    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    private UUID id = UUID.randomUUID();


    public BoletaPrestamo(){}
    public BoletaPrestamo(Pelicula pelicula, Cliente cliente){
        this.pelicula=pelicula;
        this.cliente=cliente;
        this.fechaRetiro = LocalDate.now();
        this.fechaDevolucion = LocalDate.now().plusDays(3);
    }


    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente;  }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BoletaPrestamo{" +
                "pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                ", id=" + id +
                '}';
    }
}
