package RepasoTolo;

public class Revista extends Ejemplar implements Alquiler{

    public Revista() {}

    public Revista(String titulo, String anioPublicacion, Boolean disponible) {
        super(titulo, anioPublicacion, disponible);
    }

    @Override
    public boolean alquilar() {
        if(disponible){
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
        return "Revista{" +
                "Titulo='" + titulo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
