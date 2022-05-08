package RepasoTolo;

import java.util.UUID;

public abstract class Ejemplar {

    protected UUID id=UUID.randomUUID();
    protected String titulo;
    protected String anioPublicacion;
    protected Boolean disponible;

    public Ejemplar(){}

    public Ejemplar(String titulo, String anioPublicacion, Boolean disponible) {
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
        this.disponible=disponible;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
