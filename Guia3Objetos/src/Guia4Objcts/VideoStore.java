package Guia4Objcts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VideoStore {

    private List <Pelicula> Catalogo = new ArrayList<>();
    private List <Cliente> RegistroClientes = new ArrayList<>();
    private List <BoletaPrestamo> AlquileresVigentes = new ArrayList<>();

    public VideoStore(){}
    public VideoStore(ArrayList peliculas, ArrayList Clientes, ArrayList Alquileres){
        this.Catalogo= peliculas;
        this.RegistroClientes=Clientes;
        this.AlquileresVigentes=Alquileres;
    }


    public void alquilerDePelicula(String titulo, String nombre){
        Pelicula peliculaAlq = buscaPelicula(titulo);
        Cliente clienteAlq=buscaCliente(nombre);

        if(peliculaAlq!=null && clienteAlq!=null && peliculaAlq.getStock()>0){
                BoletaPrestamo boletaPrestamo = new BoletaPrestamo(peliculaAlq, clienteAlq);
                peliculaAlq.setStock(peliculaAlq.getStock()-1);
                AlquileresVigentes.add(boletaPrestamo);
        }
    }

    public Pelicula buscaPelicula(String titulo){
        Pelicula filmFounded=null;
        for(Pelicula pelicula : Catalogo){
            if(pelicula!=null && pelicula.getTitulo().equals(titulo)){
                filmFounded = pelicula;
            }
        }
        return filmFounded;
    }
    public Cliente buscaCliente(String nombre){
        Cliente clientFounded = null;
        for(Cliente cliente: RegistroClientes){
            if(cliente!=null && cliente.getNombre().equals(nombre)){
                clientFounded=cliente;
            }
        }
        return clientFounded;
    }
    public Cliente agregarCliente(String nombre, String telefono, String direccion){
        Cliente clienteNuevo = new Cliente(nombre, telefono, direccion);
        RegistroClientes.add(clienteNuevo);
        return clienteNuevo;
    }
    public void agregarPelicula(Pelicula pelicula){
        Catalogo.add(pelicula);
    }

    public BoletaPrestamo buscaBoletaPrestamo(String nombre, String titulo){
        BoletaPrestamo boletaNueva = null;
        for(BoletaPrestamo boleta : AlquileresVigentes){
            if(boleta != null && boleta.getCliente().getNombre().equals(nombre) && boleta.getPelicula().getTitulo().equals(titulo)){
                boletaNueva = boleta;
            }
        }
        return boletaNueva;
    }

    public void DevolverPelicula(String nombre, String titulo){
        BoletaPrestamo boletaDevolucion = buscaBoletaPrestamo(nombre, titulo);
        if(boletaDevolucion!=null){
            Pelicula pelicula = buscaPelicula(titulo);
            pelicula.setStock(pelicula.getStock()+1);
            AlquileresVigentes.remove(boletaDevolucion);
        }
    }
    public void consultaAlquileres(){
        System.out.println(AlquileresVigentes);
    }
    public void consultaAlquileresDeCliente(String nombre){
        Cliente cliente = buscaCliente(nombre);
        if(cliente!=null){
            for(BoletaPrestamo boleta : AlquileresVigentes){
                if(boleta!=null && boleta.getCliente().equals(cliente)){
                    System.out.println(boleta);
                }
            }
        }
    }
    public void consultaAlquileresVencenHoy(){
        for(BoletaPrestamo boleta : AlquileresVigentes){
            if(boleta!=null && boleta.getFechaDevolucion().equals(LocalDate.now())){
                System.out.println(boleta);
            }
        }
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "Catalogo=" + Catalogo +
                ", RegistroClientes=" + RegistroClientes +
                ", AlquileresVigentes=" + AlquileresVigentes +
                '}';
    }
}
