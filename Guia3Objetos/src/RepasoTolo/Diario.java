package RepasoTolo;

public class Diario extends Ejemplar {

    public Diario(){}

    public Diario(String titulo, String anioPublicacion, Boolean disponible) {
        super(titulo, anioPublicacion, disponible);
    }

    @Override
    public String toString() {
        return "Diario{" +
                "Titulo='" + titulo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
