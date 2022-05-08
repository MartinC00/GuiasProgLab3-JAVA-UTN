package RepasoTolo;

public class Libro extends Ejemplar implements Alquiler{

    private GeneroLibro genero;

    public Libro(String titulo, String anioPublicacion, Boolean disponible ,GeneroLibro genero){
        super(titulo, anioPublicacion, disponible);
        this.genero=genero;
    }


    @Override
    public boolean alquilar() {  //Devuelve true si la operacion fue exitosa, false si no
        if(disponible){//duda: getDisponible? this.disponible? cual seria la buena practica?
            setDisponible(false);
            return true;
        }
        else return false;
    }
    @Override
    public boolean devolver() {
        if(!disponible){
            setDisponible(true);
            return true;
        }
        else return false;
    }
    @Override
    public boolean alquilado() {
        return !disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + titulo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
