package RepasoTolo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Biblioteca {

    private List <Ejemplar> biblioteca = new ArrayList<>();

    public Biblioteca(){}

    public Biblioteca(List<Ejemplar> biblioteca) {
        this.biblioteca=biblioteca;
    }

    public Ejemplar agregaEjemplar(Ejemplar ejemplar){
        biblioteca.add(ejemplar);
        return ejemplar;
    }
    public Ejemplar borraEjemplar(Ejemplar ejemplar){
        biblioteca.remove(ejemplar);
        return ejemplar;
    }

    public boolean alquilarEjemplar(String titulo){
        UUID codigo = buscaCodigo(titulo);
        boolean successed=false;

        for(Ejemplar ejemplar : biblioteca){
            if(ejemplar!=null && ejemplar.id==codigo){
                if(ejemplar instanceof Libro){
                    successed=((Libro) ejemplar).alquilar();
                }
                else if(ejemplar instanceof Revista){
                    successed=((Revista) ejemplar).alquilar();
                }
            }
        }
        return successed;
    }
    public boolean devolverEjemplar(String titulo){
        UUID codigo = buscaCodigo(titulo);
        boolean successed=false;

        for(Ejemplar ejemplar : biblioteca){
            if(ejemplar!=null && ejemplar.id==codigo){
                if(ejemplar instanceof Libro){
                    successed=((Libro) ejemplar).devolver();
                }
                else{
                    successed=((Revista) ejemplar).devolver();
                }
            }
        }
        return successed;
    }
    public boolean consultaEstado(String titulo){
        boolean successed=false;

        return successed;
    }
    UUID buscaCodigo(String titulo){
        UUID codigo=null;
        for(Ejemplar ejemplar : biblioteca){
            if(ejemplar!=null && ejemplar.getTitulo().equals(titulo)){
                codigo=ejemplar.getId();
            }
        }
        return codigo;
    }

    public List<Ejemplar> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(List<Ejemplar> biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "biblioteca=" + biblioteca +
                '}';
    }
}
